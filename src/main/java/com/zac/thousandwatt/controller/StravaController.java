package com.zac.thousandwatt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strava")
public class StravaController {

    @RequestMapping("/1000Watts")
    public String welcome() {
        return "Welcome 1000 Watts!";
    }
}
