package com.auth0.samples.bootfaces.controller;


import com.auth0.samples.bootfaces.domain.Product;
import com.auth0.samples.bootfaces.service.ProductService;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Scope(value = "session")
@Component(value = "productList")
@ELBeanName(value = "productList")
@Join(path = "/", to = "/product-list.jsf")
public class ProductListController {

	private final ProductService productService;
	private List<Product> products;

	@Autowired
	public ProductListController(ProductService productService) {
		this.productService = productService;
	}

	@Deferred
	@RequestAction
	@IgnorePostback
	public void loadData() {
		products = productService.getProducts();
	}

	public List<Product> getProducts() {
		return products;
	}
}
