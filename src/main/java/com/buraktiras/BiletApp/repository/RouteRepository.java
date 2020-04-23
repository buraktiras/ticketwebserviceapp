package com.buraktiras.BiletApp.repository;

import com.buraktiras.BiletApp.model.RouteModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RouteRepository extends JpaRepository<RouteModel, Long> {

}