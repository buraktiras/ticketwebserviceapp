package com.buraktiras.BiletApp.controller;

import com.buraktiras.BiletApp.model.FlyModel;
import com.buraktiras.BiletApp.model.TicketModel;
import com.buraktiras.BiletApp.service.FlyService;
import com.buraktiras.BiletApp.service.TicketService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private FlyService flyService;

    @RequestMapping("/tickets")
    public List<TicketModel> getAllTickets(){
        return ticketService.getAllTickets();
    }

    @RequestMapping("/tickets/{id}")
    public Optional<TicketModel> getTickets(@PathVariable Long id){
        return ticketService.getTickets(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "tickets")
    public void addTickets(@RequestBody TicketModel ticket){
        List<FlyModel> allFlies = flyService.getAllFlies();

        List<FlyModel> flyList = allFlies.stream().filter(f -> f.getName().equals(ticket.getFlyNumber())).collect(Collectors.toList());

        if(ticket.getPrice().equals(flyList.get(0).getFlyPrice()) && flyList.size() != 0){
            ticketService.addTicket(ticket);
            flyCapacityControlForUpdatePrice(ticket);
        }

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "tickets/{id}")
    public void deleteTicket(@PathVariable Long id){
         ticketService.deleteTicket(id);
    }


    private void flyCapacityControlForUpdatePrice(@RequestBody TicketModel ticket) {
        List<TicketModel> allTickets = ticketService.getAllTickets();
        List<FlyModel> allFlies = flyService.getAllFlies();
        List<TicketModel> ticketListByFlyNumber = allTickets.stream().filter(t -> t.getFlyNumber().equals(t.getFlyNumber())).collect(Collectors.toList());
        int sizeOfTicketSold = ticketListByFlyNumber.size();

        for (FlyModel fly : allFlies) {
            if(fly.getName().equals(ticket.getFlyNumber())){
                int flyCapacity = Integer.parseInt(fly.getPessengerCapacity());
                if(flyCapacity * 0.1 == sizeOfTicketSold || flyCapacity * 0.2 == sizeOfTicketSold || flyCapacity * 0.3 == sizeOfTicketSold){
                    this.updateFlyById(fly.getId(), fly);
                }
            }
        }
    }

    @PutMapping("/tickets")
    public void updateFlyById(Long id, FlyModel fly){
        List<TicketModel> allTickets = ticketService.getAllTickets();
        for(int i = 0; i<allTickets.size(); i++){
            if(fly.getId().equals(id)){

                String currentPrice = fly.getFlyPrice();
                int currentPriceInteger = Integer.parseInt(currentPrice);
                currentPriceInteger += currentPriceInteger * 0.1;
                fly.setFlyPrice(Integer.toString(currentPriceInteger));

                flyService.updateFly(id,fly);
                return;
            }
        }

    }

}
