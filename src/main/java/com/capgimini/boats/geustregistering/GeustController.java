package com.capgimini.boats.geustregistering;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/geust")

public class GeustController {
    @Autowired
    private GeustRepository geustRepository;
    @GetMapping
    @ResponseBody
    public List<Geust> getAllGeust() {
        return geustRepository.findAll();
    }
    @PostMapping("/addGeust")
    public  void postGeust (@RequestBody Geust geust) {
        geustRepository.save(geust);

    }

    @DeleteMapping("/{id}")
    public  void deleteGeust(@PathVariable Long id) {
        geustRepository.deleteById(id);


    }
}
