package com.capgimini.boats.trip;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
@Entity
public class Trip {

    @Id
    @GeneratedValue
    private Long id;
    private int numberOfPersoon;
    private int numberOfBoat;
    private LocalDateTime startTime;
    private LocalDateTime stopTime;
    private double duration;
    private double Totalprice;

    public Trip() {
    }

    public Trip(Long id, int numberOfPersoon, int numberOfBoat, LocalDateTime startTime, LocalDateTime stopTime, double duration, double totalprice) {
        this.id = id;
        this.numberOfPersoon = numberOfPersoon;
        this.numberOfBoat = numberOfBoat;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.duration = duration;
        Totalprice = totalprice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumberOfPersoon() {
        return numberOfPersoon;
    }

    public void setNumberOfPersoon(int numberOfPersoon) {
        this.numberOfPersoon = numberOfPersoon;
    }

    public int getNumberOfBoat() {
        return numberOfBoat;
    }

    public void setNumberOfBoat(int numberOfBoat) {
        this.numberOfBoat = numberOfBoat;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getStopTime() {
        return stopTime;
    }

    public void setStopTime(LocalDateTime stopTime) {
        this.stopTime = stopTime;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getTotalprice() {
        return Totalprice;
    }

    public void setTotalprice(double totalprice) {
        Totalprice = totalprice;
    }
}
