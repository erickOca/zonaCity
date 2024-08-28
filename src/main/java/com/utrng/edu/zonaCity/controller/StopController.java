package com.utrng.edu.zonaCity.controller;

import com.utrng.edu.zonaCity.model.Stop;
import com.utrng.edu.zonaCity.repository.StopRepository;
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
    @Autowired
    private StopRepository repository;

    @GetMapping("/city/{city}")
    public List<Stop> getAllStops(String trayecto) {
        return stopService.getAllStops(trayecto);
    }
    @GetMapping("/stop")
    public List<Stop> getAll() {
        return repository.findAll();
    }
}