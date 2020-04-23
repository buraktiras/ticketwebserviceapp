package com.buraktiras.BiletApp.dao;

import com.buraktiras.BiletApp.model.RouteModel;
import com.buraktiras.BiletApp.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouteDAO {

    @Autowired
    RouteRepository routeRepository;

    /*to save a route*/
    public RouteModel save(RouteModel route){
        return routeRepository.save(route);
    }

    /*search all route*/
    public List<RouteModel> findAll(){
        return routeRepository.findAll();
    }

    /*get a route by id*/
    public Optional<RouteModel> findById(Long routeId){
        return routeRepository.findById(routeId);
    }

    /*delete a route*/
    public void deleteById(Long routeId){
        routeRepository.deleteById(routeId);
    }
}
