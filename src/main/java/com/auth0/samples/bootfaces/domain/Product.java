package com.auth0.samples.bootfaces.domain;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String name;
	@Column
	private BigDecimal price;
	public Product() {
	}
	public Product(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
}
