package br.com.supera.game.store.PSJavamain.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.hateoas.RepresentationModel;

@Entity
@Table(name = "TB_PRODUTO")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idProduto;

	@Valid
	@NotNull
	private String name;

	@Valid
	@NotNull
	public BigDecimal price;

	@Valid
	@NotNull
	public short score;

	@Valid
	@NotNull
	public String image;

	public long getIdProduto() {
		return this.idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public short getScore() {
		return this.score;
	}

	public void setScore(short score) {
		this.score = score;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
