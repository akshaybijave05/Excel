package com.excel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

	
}
