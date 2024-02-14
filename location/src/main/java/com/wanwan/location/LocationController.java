package com.wanwan.location;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/location")
@AllArgsConstructor
public class LocationController {
    private final LocationService locationService;

    @PostMapping
    public void registerLocation(@RequestBody LocationRegistrationRequest locationRegistrationRequest) {
        log.info("new location registration {}", locationRegistrationRequest);
        locationService.registerLocation(locationRegistrationRequest);
    }
}
