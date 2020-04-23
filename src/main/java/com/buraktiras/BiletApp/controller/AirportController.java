package com.buraktiras.BiletApp.controller;

import com.buraktiras.BiletApp.model.AirportsModel;
import com.buraktiras.BiletApp.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AirportController {

    @Autowired
    private AirportService airportService;

    @RequestMapping("/airports")
    public List<AirportsModel> getAllAirports(){
        return airportService.getAllAirports();
    }

    @RequestMapping("/airports/{name}")
    public List<AirportsModel> getAirport(@PathVariable String name){
        return airportService.getAirport(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "airports")
    public void addAirport(@RequestBody AirportsModel airport){
        airportService.addAirport(airport);
    }

}
