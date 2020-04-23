package com.buraktiras.BiletApp.repository;

import com.buraktiras.BiletApp.model.AirportsModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AirportRepository extends JpaRepository<AirportsModel, Long> {

}