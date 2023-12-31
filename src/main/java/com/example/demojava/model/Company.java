package com.example.demojava.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name="Company", schema = "DEMOJAVA")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Company {

    @Id
    private String id;

    @NotNull
    @Column(name= "companyName")
    private String companyName;

    @NotNull
    @Column(name= "adress")
    private String adress;

    public Company() {
    }

    public Company(String companyName, String adress) {

        this.companyName = companyName;
        this.adress = adress;
    }

    public String getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAdress() {
        return adress;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
