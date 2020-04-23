package com.buraktiras.BiletApp.service;

import com.buraktiras.BiletApp.dao.AirlinesCompanyDAO;
import com.buraktiras.BiletApp.model.AirlineCompanyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AirlineCompanyService {

    @Autowired
    AirlinesCompanyDAO airlinesCompanyDAO;

    public List<AirlineCompanyModel> getAllAirlineCompany() {
        return  airlinesCompanyDAO.findAll();
    }

    public AirlineCompanyModel getAirlineCompany(String name){
        List<AirlineCompanyModel> allCompanies = airlinesCompanyDAO.findAll();
        return allCompanies.stream().filter(t -> t.getAirlinesName().equals(name)).findFirst().get();
    }

    public void addAirlineCompany(AirlineCompanyModel airline) {
        airlinesCompanyDAO.save(airline);
    }
}
