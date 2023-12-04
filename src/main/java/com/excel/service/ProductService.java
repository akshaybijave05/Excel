package com.excel.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.excel.entity.Product;

public interface ProductService {

	void save(MultipartFile file);

	List<Product> getAllProducts();

	
}
