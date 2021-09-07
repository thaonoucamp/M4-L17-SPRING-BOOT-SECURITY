package com.codegym.demospringbootsecurity.service;

import com.codegym.demospringbootsecurity.model.Product;

import java.util.ArrayList;

public interface IProductService {
    ArrayList<Product> findAll();
}