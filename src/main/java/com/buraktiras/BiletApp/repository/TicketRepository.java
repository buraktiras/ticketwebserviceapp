package com.buraktiras.BiletApp.repository;

import com.buraktiras.BiletApp.model.TicketModel;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TicketRepository extends JpaRepository<TicketModel, Long> {

}