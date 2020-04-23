package com.buraktiras.BiletApp.repository;

import com.buraktiras.BiletApp.model.AirlineCompanyModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AirlineCompaniesRepository extends JpaRepository<AirlineCompanyModel, Long> {

}