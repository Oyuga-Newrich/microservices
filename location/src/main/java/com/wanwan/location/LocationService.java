package com.wanwan.location;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LocationService {
    private final LocationRepository locationRepository;
    public void registerLocation(LocationRegistrationRequest request) {
        Location location = Location.builder()
                .county(request.county())
                .sub_county(request.sub_county())
                .latitude(request.latitude())
                .longitude(request.longitude())
                .build();
        // todo:check if sub_county exist
        locationRepository.save(location);
    }
}
