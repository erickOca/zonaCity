package com.utrng.edu.zonaCity.controller;

import com.utrng.edu.zonaCity.model.Stop;
import com.utrng.edu.zonaCity.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stops")
public class StopController {

    @Autowired
    private StopService stopService;

    @GetMapping
    public List<Stop> getAllStops() {
        return stopService.getAllStops();
    }
}