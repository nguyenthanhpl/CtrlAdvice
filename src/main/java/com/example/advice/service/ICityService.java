package com.example.advice.service;

import com.example.advice.model.City;

import java.util.List;

public interface ICityService {
    City findById(Long id);
    City save(City city);
    List<City> findAll();
}
