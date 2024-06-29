package com.utrng.edu.zonaCity.controller;

import com.utrng.edu.zonaCity.service.MqttGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@RestController
public class MqttController {
    @Autowired
    MqttGateway mqtGateway;
    @PostMapping("/sendMessage")
    public ResponseEntity<String> publish(@RequestBody String mqttMessage) {
        try {
//New cambio
            JsonObject jsonObject = new Gson().fromJson(mqttMessage, JsonObject.class);
            String message = jsonObject.get("message").getAsString();
            String topic = jsonObject.get("topic").getAsString();
            mqtGateway.sendToMqtt(message, topic);
            return ResponseEntity.ok("Success");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.status(500).body("Fail");
        }
    }
}