package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CoffiShop;

public interface ShopRepository extends JpaRepository<CoffiShop, Integer> {

}
