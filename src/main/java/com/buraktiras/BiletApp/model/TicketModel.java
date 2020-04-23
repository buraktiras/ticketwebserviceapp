package com.buraktiras.BiletApp.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Tickets")
@EntityListeners(AuditingEntityListener.class)
public class TicketModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String ticketHolder;
    @NotBlank
    private String roundTrip;
    @NotBlank
    private String price;
    @NotBlank
    private String flyNumber;

    public TicketModel() {

    }

    public TicketModel(Long id, String ticketHolder, String roundTrip, String flyNumber) {
        this.id = id;
        this.ticketHolder = ticketHolder;
        this.roundTrip = roundTrip;
        this.flyNumber = flyNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicketHolder() {
        return ticketHolder;
    }

    public void setTicketHolder(String ticketHolder) {
        this.ticketHolder = ticketHolder;
    }

    public String getRoundTrip() {
        return roundTrip;
    }

    public void setRoundTrip(String roundTrip) {
        this.roundTrip = roundTrip;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setFlyNumber(String flyNumber) {
        this.flyNumber = flyNumber;
    }

    public String getFlyNumber() {
        return flyNumber;
    }
}
