package com.buraktiras.BiletApp.service;

import com.buraktiras.BiletApp.dao.FlyDAO;
import com.buraktiras.BiletApp.model.FlyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlyService {

    @Autowired
    FlyDAO flyDAO;

    public List<FlyModel> getAllFlies() {
        return flyDAO.findAll();
    }

    public Optional<FlyModel> getFlies(Long id){
        return flyDAO.findById(id);
    }

    public void addFly(FlyModel fly) {
        flyDAO.save(fly);
    }

    public void updateFly(Long id, FlyModel fly) {
        flyDAO.save(fly);
    }

}
