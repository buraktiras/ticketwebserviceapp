package com.buraktiras.BiletApp.dao;

import com.buraktiras.BiletApp.model.AirportsModel;
import com.buraktiras.BiletApp.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirportDAO {

    @Autowired
    AirportRepository airportRepository;

    /*to save an airport*/
    public AirportsModel save(AirportsModel airport){
        return airportRepository.save(airport);
    }

    /*search all airport*/
    public List<AirportsModel> findAll(){
        return airportRepository.findAll();
    }

    /*get an airport by id*/
    public Optional<AirportsModel> findById(Long airportId){
        return airportRepository.findById(airportId);
    }

}
