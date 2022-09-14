package com.example.advice.service;

import com.example.advice.exception.CityNotFoundException;
import com.example.advice.exception.NoDataFoundException;
import com.example.advice.model.City;
import com.example.advice.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CityService implements ICityService {

    @Autowired
    private ICityRepository iCityRepository;

    public CityService(ICityRepository iCityRepository) {
        this.iCityRepository = iCityRepository;
    }


    @Override
    public City findById(Long id) {
        return iCityRepository.findById(id)
                .orElseThrow(() -> new CityNotFoundException(id));
    }

    @Override
    public City save(City city) {
        return iCityRepository.save(city);
    }

    @Override
    public List<City> findAll() {
        var city = (List<City>) iCityRepository.findAll();
        if (city.isEmpty()) {

            throw new NoDataFoundException();
        }

        return city;
    }
}
