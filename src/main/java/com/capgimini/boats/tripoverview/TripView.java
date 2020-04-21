package com.capgimini.boats.tripoverview;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TripView {

    @Id
    @GeneratedValue
    private String date;
    private int numberOfEndedTrips;
    private int numberOfOngoingTrips;
    private double AvargeDuration;
    private int numberOfusageBoats;
    private Double Totalincome;
    private int numberOfSeats;

    public TripView() {
    }

    public TripView(String date, int numberOfEndedTrips, int numberOfOngoingTrips, double avargeDuration, int numberOfusageBoats, Double totalincome, int numberOfSeats) {
        this.date = date;
        this.numberOfEndedTrips = numberOfEndedTrips;
        this.numberOfOngoingTrips = numberOfOngoingTrips;
        AvargeDuration = avargeDuration;
        this.numberOfusageBoats = numberOfusageBoats;
        Totalincome = totalincome;
        this.numberOfSeats = numberOfSeats;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumberOfEndedTrips() {
        return numberOfEndedTrips;
    }

    public void setNumberOfEndedTrips(int numberOfEndedTrips) {
        this.numberOfEndedTrips = numberOfEndedTrips;
    }

    public int getNumberOfOngoingTrips() {
        return numberOfOngoingTrips;
    }

    public void setNumberOfOngoingTrips(int numberOfOngoingTrips) {
        this.numberOfOngoingTrips = numberOfOngoingTrips;
    }

    public double getAvargeDuration() {
        return AvargeDuration;
    }

    public void setAvargeDuration(double avargeDuration) {
        AvargeDuration = avargeDuration;
    }

    public int getNumberOfusageBoats() {
        return numberOfusageBoats;
    }

    public void setNumberOfusageBoats(int numberOfusageBoats) {
        this.numberOfusageBoats = numberOfusageBoats;
    }

    public Double getTotalincome() {
        return Totalincome;
    }

    public void setTotalincome(Double totalincome) {
        Totalincome = totalincome;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}