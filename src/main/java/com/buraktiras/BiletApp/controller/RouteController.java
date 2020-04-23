package com.buraktiras.BiletApp.controller;

import com.buraktiras.BiletApp.model.AirportsModel;
import com.buraktiras.BiletApp.model.RouteModel;
import com.buraktiras.BiletApp.service.AirportService;
import com.buraktiras.BiletApp.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RouteController {

    @Autowired
    private RouteService routeService;

    @Autowired
    private AirportService airportService;

    @RequestMapping("/routes")
    public List<RouteModel> getAllRoutes(){
        return routeService.getAllRoutes();
    }

    @RequestMapping("/routes/{route}")
    public List<RouteModel> getRoutes(@PathVariable String route){
        return routeService.getRoutes(route);
    }

    @RequestMapping(method = RequestMethod.POST, value = "routes")
    public void addRoutes(@RequestBody RouteModel route){
        List<AirportsModel> airportList = airportService.getAllAirports();
        AirportsModel airport = airportList.stream().filter(a -> a.getAirportName().equals(route.getDestination())).findFirst().get();

        if(airport!=null)
            routeService.addRoute(route);
    }


}
