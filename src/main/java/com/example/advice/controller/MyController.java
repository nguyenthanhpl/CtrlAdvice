package com.example.advice.controller;

import com.example.advice.model.City;
import com.example.advice.service.ICityService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MyController {

    private final ICityService iCityService;

    public MyController(ICityService iCityService) {
        this.iCityService = iCityService;
    }


    @GetMapping(value = "/cities/{id}")
    public City getCity(@PathVariable Long id) {

        return iCityService.findById(id);
    }

    @PostMapping(value = "/cities", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public City createCity(@RequestBody @Valid City city) {

        return iCityService.save(city);
    }

    @GetMapping(value = "/cities")
    public List<City> findAll() {

        return iCityService.findAll();
    }
}
