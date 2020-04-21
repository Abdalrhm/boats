package com.capgimini.boats.boat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/boat")

public class BoatController {
    @Autowired
    private BoatRepository boatRepository;
    @GetMapping
    @ResponseBody
    public List<Boat> getAllBoat() {
        return boatRepository.findAll();
    }
    @PostMapping("/addBoat")
    public  void postBoat (@RequestBody Boat boat) {
        boatRepository.save(boat);

    }

    @DeleteMapping("/{id}")
    public  void deleteBoat(@PathVariable Long id) {
        boatRepository.deleteById(id);


    }
}
