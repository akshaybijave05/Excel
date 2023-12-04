package com.excel.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.excel.entity.Product;
import com.excel.helper.Helper;
import com.excel.repository.ProductRepo;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceImpl implements com.excel.service.ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public void save(MultipartFile file) {

        try {
            List<Product> products = Helper.convertExcelToListOfProduct(file.getInputStream());
            this.productRepo.saveAll(products);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Product> getAllProducts() {
        return this.productRepo.findAll();
    }


}
