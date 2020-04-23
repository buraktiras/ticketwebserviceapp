package com.buraktiras.BiletApp.service;

import com.buraktiras.BiletApp.dao.RouteDAO;
import com.buraktiras.BiletApp.model.AirportsModel;
import com.buraktiras.BiletApp.model.RouteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RouteService {

    @Autowired
    RouteDAO routeDAO;

    public List<RouteModel> getAllRoutes() {
        return routeDAO.findAll();
    }

    public List<RouteModel> getRoutes(String routes){
        List<RouteModel> allRoutes = routeDAO.findAll();
        return allRoutes.stream().filter(t -> t.getRoute().equals(routes)).collect(Collectors.toList());
    }

    public void addRoute(RouteModel route) {
        routeDAO.save(route);
    }
}
