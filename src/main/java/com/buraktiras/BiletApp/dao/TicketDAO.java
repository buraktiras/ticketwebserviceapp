package com.buraktiras.BiletApp.dao;

import com.buraktiras.BiletApp.model.TicketModel;
import com.buraktiras.BiletApp.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class TicketDAO {

    @Autowired
    TicketRepository ticketRepository;

    /*to save a ticket*/
    public TicketModel save(TicketModel ticket){
        return ticketRepository.save(ticket);
    }

    /*search all ticket*/
    public List<TicketModel> findAll(){
        return ticketRepository.findAll();
    }

    /*get a ticket by id*/
    public Optional<TicketModel> findById(Long ticketId){
        return ticketRepository.findById(ticketId);
    }

    /*get all tickets by id*/
    public List<TicketModel> findAllById(Long ticketId){
        return ticketRepository.findAllById(Collections.singleton(ticketId));
    }


    /*delete a ticket*/
    public void deleteById(Long ticketId){
         ticketRepository.deleteById(ticketId);
    }
}
