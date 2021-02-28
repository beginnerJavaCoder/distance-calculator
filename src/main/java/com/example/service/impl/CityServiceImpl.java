package com.example.service.impl;

import com.example.domain.City;
import com.example.repository.CityRepository;
import com.example.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
}
