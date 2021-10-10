package br.com.supera.game.store.PSJavamain.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import br.com.supera.game.store.PSJavamain.models.ProductModel;
import br.com.supera.game.store.PSJavamain.repositories.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	ProductRepository produtoRepository;

	@GetMapping("/product")
	public ResponseEntity<List<ProductModel>> getAllProdutos() {
		List<ProductModel> produtosList = produtoRepository.findAll();
		if (produtosList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			for (ProductModel produto : produtosList) {
				long id = produto.getIdProduto();
				produto.add(linkTo(methodOn(ProductController.class).getOneProduto(id)).withSelfRel());
			}
			return new ResponseEntity<List<ProductModel>>(produtosList, HttpStatus.OK);
		}
	}

	@GetMapping("/product/{id}")
	public ResponseEntity<ProductModel> getOneProduto(@PathVariable(value = "id") long id) {
		Optional<ProductModel> produtoO = produtoRepository.findById(id);
		if (!produtoO.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			produtoO.get().add(linkTo(methodOn(ProductController.class).getAllProdutos()).withRel("Lista de Produtos"));
			return new ResponseEntity<ProductModel>(produtoO.get(), HttpStatus.OK);
		}
	}

	@PostMapping("/product")
	public ResponseEntity<ProductModel> saveProduto(@RequestBody @Valid ProductModel produto) {
		try {
			// Crio um objeto da entidade preenchendo com os valores do DTO e validando
			if (produto.getName() == null) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			produto.setName(produto.getName());

			// Se foi criado com sucesso, retorno o objeto criado
			return new ResponseEntity<ProductModel>(produtoRepository.save(produto), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/product/{id}")
	public ResponseEntity<?> deleteProduto(@PathVariable(value = "id") long id) {
		Optional<ProductModel> produtoO = produtoRepository.findById(id);
		if (!produtoO.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			produtoRepository.delete(produtoO.get());
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}

}
