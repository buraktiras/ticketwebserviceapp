package com.buraktiras.BiletApp.dao;

import com.buraktiras.BiletApp.model.AirlineCompanyModel;
import com.buraktiras.BiletApp.repository.AirlineCompaniesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirlinesCompanyDAO {

    @Autowired
    AirlineCompaniesRepository airlineCompaniesRepository;

    /*to save an airline comp.*/
    public AirlineCompanyModel save(AirlineCompanyModel airlineCompany){
        return airlineCompaniesRepository.save(airlineCompany);
    }

    /*search all airline comp.*/
    public List<AirlineCompanyModel> findAll(){
        return airlineCompaniesRepository.findAll();
    }

    /*get an airline comp. by id*/
    public Optional<AirlineCompanyModel> findById(Long airlineCompanyId){
        return airlineCompaniesRepository.findById(airlineCompanyId);
    }

}
