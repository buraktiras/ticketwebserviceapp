package com.buraktiras.BiletApp.service;

import com.buraktiras.BiletApp.dao.TicketDAO;
import com.buraktiras.BiletApp.model.TicketModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    TicketDAO ticketDAO;


    public List<TicketModel> getAllTickets() {
        return ticketDAO.findAll();
    }

    public Optional<TicketModel> getTickets(Long id){
        return ticketDAO.findById(id);
    }

    public List<TicketModel> getTicketByRoundTrip(Long roundTrip){
        return ticketDAO.findAllById(roundTrip);
    }

    public void addTicket(TicketModel ticket) {
        ticketDAO.save(ticket);
    }

    public void deleteTicket(Long id) {
        ticketDAO.deleteById(id);
    }
}
