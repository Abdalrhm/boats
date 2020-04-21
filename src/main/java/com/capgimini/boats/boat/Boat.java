package com.capgimini.boats.boat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Boat {

    @Id
    @GeneratedValue
    private Long id;
    private String typeBoat;
    private double minimumPrice;
    private double actualPrice;
    private int boatNumber;
    private int seatsNumber;

    public Boat() {

    }

    public Boat(Long id, String typeBoat, double minimumPrice, double actualPrice, int boatNumber, int seatsNumber) {
        this.id = id;
        this.typeBoat = typeBoat;
        this.minimumPrice = minimumPrice;
        this.actualPrice = actualPrice;
        this.boatNumber = boatNumber;
        this.seatsNumber = seatsNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeBoat() {
        return typeBoat;
    }

    public void setTypeBoat(String typeBoat) {
        this.typeBoat = typeBoat;
    }

    public double getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(double minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    public double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public int getBoatNumber() {
        return boatNumber;
    }

    public void setBoatNumber(int boatNumber) {
        this.boatNumber = boatNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }
}