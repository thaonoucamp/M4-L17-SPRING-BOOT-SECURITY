package com.codegym.demospringbootsecurity.repository;

import com.codegym.demospringbootsecurity.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface IProductRepo extends CrudRepository<Product,Long> {
}