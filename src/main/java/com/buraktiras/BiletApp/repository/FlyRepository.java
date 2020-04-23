package com.buraktiras.BiletApp.repository;

import com.buraktiras.BiletApp.model.FlyModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FlyRepository extends JpaRepository<FlyModel, Long> {

}