package com.buraktiras.BiletApp.dao;

import com.buraktiras.BiletApp.model.FlyModel;
import com.buraktiras.BiletApp.repository.FlyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlyDAO {

    @Autowired
    FlyRepository flyRepository;

    /*to save a fly*/
    public FlyModel save(FlyModel fly){
        return flyRepository.save(fly);
    }

    /*search all fly*/
    public List<FlyModel> findAll(){
        return flyRepository.findAll();
    }

    /*get a fly by id*/
    public Optional<FlyModel> findById(Long flyId){
        return flyRepository.findById(flyId);
    }

    /*delete a fly*/
    public void deleteById(Long flyId){
         flyRepository.deleteById(flyId);
    }

}
