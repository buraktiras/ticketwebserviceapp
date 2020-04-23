package com.buraktiras.BiletApp.controller;

import com.buraktiras.BiletApp.model.AirlineCompanyModel;
import com.buraktiras.BiletApp.model.FlyModel;
import com.buraktiras.BiletApp.model.RouteModel;
import com.buraktiras.BiletApp.service.AirlineCompanyService;
import com.buraktiras.BiletApp.service.FlyService;
import com.buraktiras.BiletApp.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
public class FlyController {

    @Autowired
    private FlyService flyService;

    @Autowired
    private AirlineCompanyService airlineCompanyService;
    
    @Autowired
    private RouteService routeService;

    @RequestMapping("/flies")
    public List<FlyModel> getAllFlies(){
        return flyService.getAllFlies();
    }

    @RequestMapping("/flies/{id}")
    public Optional<FlyModel> getFly(@PathVariable Long id){
        return flyService.getFlies(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "flies")
    public void addFly(@RequestBody FlyModel fly){
        boolean isValideAirlineComp=false;
        boolean isValideRoute=false;
        List<AirlineCompanyModel> airlineCompaniesList = airlineCompanyService.getAllAirlineCompany();
        List<RouteModel> allRoutesList = routeService.getAllRoutes();

        for (RouteModel route : allRoutesList) {
            if(fly.getRoute().equals(route.getRoute())){
                isValideRoute=true;
            }
        }
        for (AirlineCompanyModel airlineCompany : airlineCompaniesList ) {
            if(fly.getAirlineCompany().equals(airlineCompany.getAirlinesName()))
                isValideAirlineComp = true;
        }

        if(isValideAirlineComp && isValideRoute)
           flyService.addFly(fly);
    }
}
