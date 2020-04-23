package com.buraktiras.BiletApp.model;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name="AirlineCompanies")
@EntityListeners(AuditingEntityListener.class)
public class AirlineCompanyModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String airlinesName;
    @NotBlank
    private String airlinesDesc;

    public AirlineCompanyModel() {

    }

    public AirlineCompanyModel(Long id, String airlinesName, String airlinesDesc) {
        this.id = id;
        this.airlinesName = airlinesName;
        this.airlinesDesc = airlinesDesc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirlinesName() {
        return airlinesName;
    }

    public void setAirlinesName(String airlinesName) {
        this.airlinesName = airlinesName;
    }

    public String getAirlinesDesc() {
        return airlinesDesc;
    }

    public void setAirlinesDesc(String airlinesDesc) {
        this.airlinesDesc = airlinesDesc;
    }

}
