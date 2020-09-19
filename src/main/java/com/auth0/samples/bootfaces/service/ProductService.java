package com.auth0.samples.bootfaces.service;

import com.auth0.samples.bootfaces.domain.Product;
import com.auth0.samples.bootfaces.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
	private final ProductRepository productRepository;

	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public Product save(Product product) {
		return this.productRepository.save(product);
	}

	public List<Product> getProducts() {
		return this.productRepository.findAll();
	}
}
