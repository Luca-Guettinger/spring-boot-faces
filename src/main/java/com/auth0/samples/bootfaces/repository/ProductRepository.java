package com.auth0.samples.bootfaces.repository;

import com.auth0.samples.bootfaces.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
