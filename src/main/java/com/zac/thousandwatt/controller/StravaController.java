package com.zac.thousandwatt.controller;

import com.zac.thousandwatt.service.StravaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strava")
public class StravaController {


    private final StravaService stravaService;

    public StravaController(StravaService stravaService) {
        this.stravaService = stravaService;
    }

    @GetMapping("/1000Watts/{code}")
    public String welcome(@PathVariable("code") String code) {
        String name = stravaService.getName(code);
        return "Welcome 1000 Watts, " + name + "!";
    }
}
