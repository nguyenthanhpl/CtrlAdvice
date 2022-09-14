package com.example.advice.repository;

import com.example.advice.model.City;
import org.springframework.data.repository.CrudRepository;

public interface ICityRepository extends CrudRepository<City,Long> {
}
