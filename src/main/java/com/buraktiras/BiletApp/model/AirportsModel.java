package com.buraktiras.BiletApp.model;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name="Airports")
@EntityListeners(AuditingEntityListener.class)
public class AirportsModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String airportName;
    @NotBlank
    private String airportDesc;


    public AirportsModel() {

    }

    public AirportsModel(Long id, String airportName, String airportDesc) {
        this.id = id;
        this.airportName = airportName;
        this.airportDesc = airportDesc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportDesc() {
        return airportDesc;
    }

    public void setAirportDesc(String airportDesc) {
        this.airportDesc = airportDesc;
    }


}
