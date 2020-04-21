package com.capgimini.boats.geustregistering;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Geust {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int idNumber;
    private int phone;

    public Geust() {
    }

    public Geust(Long id, String name, int idNumber, int phone) {
        this.id = id;
        this.name = name;
        this.idNumber = idNumber;
        this.phone = phone;
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

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}
