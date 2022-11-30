package com.example.demo.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface CustomerJpa extends JpaRepository<CustomerModel,Integer>{






}
