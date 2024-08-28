package com.utrng.edu.zonaCity.repository;


import com.utrng.edu.zonaCity.model.Stop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StopRepository extends JpaRepository<Stop, Integer> {

    public List<Stop> findBytrayecto(String trayecto);
}