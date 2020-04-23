package com.buraktiras.BiletApp.model;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name="Flies")
@EntityListeners(AuditingEntityListener.class)
public class FlyModel{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String pessengerCapacity;
    @NotBlank
    private String route;
    @NotBlank
    private String airlineCompany;
    @NotBlank
    private String flyPrice;

    public FlyModel() {
    }

    public FlyModel(Long id, String name, String pessengerCapacity, String route, String airlineCompany, String flyPrice) {
        this.id = id;
        this.name = name;
        this.pessengerCapacity = pessengerCapacity;
        this.route = route;
        this.airlineCompany = airlineCompany;
        this.flyPrice = flyPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPessengerCapacity() {
        return pessengerCapacity;
    }

    public void setPessengerCapacity(String pessengerCapacity) {
        this.pessengerCapacity = pessengerCapacity;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getAirlineCompany() {
        return airlineCompany;
    }

    public void setAirlineCompany(String airlineCompany) {
        this.airlineCompany = airlineCompany;
    }

    public String getFlyPrice() {
        return flyPrice;
    }

    public void setFlyPrice(String flyPrice) {
        this.flyPrice = flyPrice;
    }
}
