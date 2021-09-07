package com.codegym.demospringbootsecurity.service;

import com.codegym.demospringbootsecurity.model.Product;
import com.codegym.demospringbootsecurity.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepo productRepo;

    @Override
    public ArrayList<Product> findAll() {
        return (ArrayList<Product>) productRepo.findAll();
    }
}