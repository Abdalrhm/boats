package com.capgimini.boats.tripoverview;

import com.capgimini.boats.boat.BoatRepository;
import com.capgimini.boats.trip.Trip;
import com.capgimini.boats.trip.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController

@RequestMapping("api/tripview")
public class TripViewController {
    @Autowired
    private TripViewRepository tripViewRepository;

    @Autowired
    private BoatRepository boatRepository;

    @Autowired
    private TripRepository tripRepository;

//    @GetMapping("/tripOverviews")
//    public TripView getTripsOverview (){
//        TripView tripView = new TripView();
//
//        LocalDate today = LocalDate.now();
//        List<Trip> ongoingTrips = tripRepository.findAllByStatus("ongoing");
//        List<Trip> endedTrips = tripRepository.findAllByEndDateAndStatus(today, "ended");
//        Integer numberOfOngoingTrips = ongoingTrips.size();
//        Integer numberOfEndedTrips = endedTrips.size();
//
//        Double totalDuration = 0.00;
//        Double totalPrice = 0.00;
//
//        for(Trip trip : endedTrips){
//            totalDuration += trip.getDuration();
//            totalPrice += trip.getTotalprice();
//        }
//
//        tripView.setNumberOfOngoingTrips(numberOfOngoingTrips);
//        tripView.setNumberOfEndedTrips(numberOfEndedTrips);
//
//        tripView.setAvargeDuration(totalDuration/numberOfEndedTrips);
//
//        tripView.setTotalincome(totalPrice);
//        tripView.setNumberOfusageBoats(numberOfEndedTrips+numberOfOngoingTrips);
//
//        return tripView;
//    }

}
