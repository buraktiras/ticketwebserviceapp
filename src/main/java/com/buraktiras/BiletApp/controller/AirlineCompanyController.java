package com.buraktiras.BiletApp.controller;

import com.buraktiras.BiletApp.model.AirlineCompanyModel;
import com.buraktiras.BiletApp.service.AirlineCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AirlineCompanyController {

    @Autowired
    private AirlineCompanyService airlineCompanyService;

    @RequestMapping("/airlineCompany")
    public List<AirlineCompanyModel> getAllCompanies(){
        return airlineCompanyService.getAllAirlineCompany();
    }

    @RequestMapping("/airlineCompany/{name}")
    public AirlineCompanyModel getAirlineCompany(@PathVariable String name){
        return airlineCompanyService.getAirlineCompany(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "airlineCompany")
    public void addAirlineCompany(@RequestBody AirlineCompanyModel airline){

        airlineCompanyService.addAirlineCompany(airline);
    }

}
