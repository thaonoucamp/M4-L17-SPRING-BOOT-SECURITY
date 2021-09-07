package com.codegym.demospringbootsecurity.repository;

import com.codegym.demospringbootsecurity.model.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface IAppUserRepo extends CrudRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}