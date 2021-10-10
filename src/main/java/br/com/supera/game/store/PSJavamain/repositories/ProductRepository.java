package br.com.supera.game.store.PSJavamain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.supera.game.store.PSJavamain.models.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {

}
