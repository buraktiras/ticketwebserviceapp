package com.buraktiras.BiletApp.service;

import com.buraktiras.BiletApp.dao.AirportDAO;
import com.buraktiras.BiletApp.model.AirportsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AirportService {

    @Autowired
    AirportDAO airportDAO;

    public List<AirportsModel> getAllAirports() {
        return airportDAO.findAll();
    }

    public List<AirportsModel> getAirport(String name){
        List<AirportsModel> allAirports = airportDAO.findAll();
        return allAirports.stream().filter(t -> t.getAirportName().equals(name)).collect(Collectors.toList());
    }

    public void addAirport(AirportsModel airport) {
        airportDAO.save(airport);
    }
}
