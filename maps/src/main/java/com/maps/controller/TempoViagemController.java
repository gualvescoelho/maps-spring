package com.maps.controller;

import java.io.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maps.service.GoogleMapsService;

@RestController
@ComponentScan(basePackages = "com.maps")
public class TempoViagemController {

    private final GoogleMapsService googleMapsService;

    @Autowired
    public TempoViagemController(GoogleMapsService googleMapsService) {
        this.googleMapsService = googleMapsService;
    }

    @GetMapping("/tempo-viagem")
    public String obterTempoViagem(@RequestParam("origem") String origem, @RequestParam("destino") String destino) {
        System.out.println(googleMapsService.obterTempoDeViagem(origem, destino));
        return googleMapsService.obterTempoDeViagem(origem, destino);
    }

}