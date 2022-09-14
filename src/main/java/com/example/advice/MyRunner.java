package com.example.advice;

import com.example.advice.model.City;
import com.example.advice.repository.ICityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class MyRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    private final ICityRepository iCityRepository;

    public MyRunner(ICityRepository iCityRepository) {
        this.iCityRepository = iCityRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        logger.info("Saving cities");

        iCityRepository.save(new City("Bratislava", 432000));
        iCityRepository.save(new City("Budapest", 1759000));
        iCityRepository.save(new City("Prague", 1280000));
        iCityRepository.save(new City("Warsaw", 1748000));
        iCityRepository.save(new City("Los Angeles", 3971000));
        iCityRepository.save(new City("New York", 8550000));
        iCityRepository.save(new City("Edinburgh", 464000));
        iCityRepository.save(new City("Suzhou", 4327066));
        iCityRepository.save(new City("Zhengzhou", 4122087));
        iCityRepository.save(new City("Berlin", 3671000));
    }
}
