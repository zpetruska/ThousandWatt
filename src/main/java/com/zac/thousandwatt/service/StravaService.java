package com.zac.thousandwatt.service;

import javastrava.api.v3.auth.AuthorisationService;
import javastrava.api.v3.auth.impl.retrofit.AuthorisationServiceImpl;
import javastrava.api.v3.auth.model.Token;
import javastrava.api.v3.model.StravaAthlete;
import javastrava.api.v3.service.Strava;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class StravaService {

    @Value("${strava.client-id}")
    private Integer application_client_id;
    @Value("${strava.client-secret}")
    private String client_secret;

    public String getName(String code) {
        AuthorisationService service = new AuthorisationServiceImpl();
        Token token = service.tokenExchange(application_client_id, client_secret, code);
        Strava strava = new Strava(token);
        StravaAthlete athlete = strava.getAthlete(893141);
        return athlete.getFirstname();
    }
}
