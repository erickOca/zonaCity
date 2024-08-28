package com.utrng.edu.zonaCity.service;

import com.utrng.edu.zonaCity.model.Stop;
import com.utrng.edu.zonaCity.repository.StopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopServiceImpl implements StopService{

    @Autowired
    private StopRepository stopRepository;

    public List<Stop> getAllStops(String trayecto) {
        return stopRepository.findBytrayecto(trayecto);
    }
}

