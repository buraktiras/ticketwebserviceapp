package com.buraktiras.BiletApp.model;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name="Routes")
@EntityListeners(AuditingEntityListener.class)
public class RouteModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String flyingCompany;
    @NotBlank
    private String route;
    @NotBlank
    private String destination;

    public RouteModel() {
    }

    public RouteModel(Long id, String flyingCompany, String route, String destination) {
        this.id = id;
        this.flyingCompany = flyingCompany;
        this.route = route;
        this.destination = destination;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlyingCompany() {
        return flyingCompany;
    }

    public void setFlyingCompany(String flyingCompany) {
        this.flyingCompany = flyingCompany;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
