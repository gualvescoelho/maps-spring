package com.maps.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.TravelMode;

@Service
public class GoogleMapsService {

    private final GeoApiContext context;

    public GoogleMapsService(@Value("AIzaSyBosIiBvB2RxNEmFunciANWhcqsi-U4mrI") String apiKey) {
        context = new GeoApiContext.Builder()
                .apiKey("AIzaSyBosIiBvB2RxNEmFunciANWhcqsi-U4mrI")
                .build();
    }

    public String obterTempoDeViagem(String origem, String destino) {
        try {
            DirectionsResult result = DirectionsApi.newRequest(context)
                    .mode(TravelMode.DRIVING)
                    .origin(origem)
                    .destination(destino)
                    .await();

            if (result.routes != null && result.routes.length > 0) {
                return result.routes[0].legs[0].duration.humanReadable;
            }

            return "Não foi possível obter o tempo de viagem.";
        } catch (Exception e) {
            return "Erro ao obter o tempo de viagem: " + e.getMessage();
        }
    }
}

