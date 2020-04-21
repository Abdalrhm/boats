package com.capgimini.boats.trip;

import com.capgimini.boats.tripoverview.TripView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/trips")
public class TripController {

    @Autowired
    private TripRepository tripRepository;

    // creating a mapping for all trips from a database
    @GetMapping
//    @ResponseBody
    public List<Trip> getAllTrip() {
        return tripRepository.findAll();
    }

    //creating a post: (creating new) mapping to the database

    @PostMapping("/addtrip")
    public void postTrip(@RequestBody Trip trip) {
        trip.setStartTime(LocalDateTime.now());
        tripRepository.save(trip);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        tripRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Trip stopTrip(@PathVariable Long id) {
      Trip trip = tripRepository.getOne(id);
      trip.setStopTime(LocalDateTime.now());
      Duration duration = Duration.between(trip.getStartTime(), trip.getStopTime());
      long seconds = duration.getSeconds();
      long minutes = seconds / 60;
      trip.setDuration(seconds);

        return tripRepository.save(trip);
    }

    }
