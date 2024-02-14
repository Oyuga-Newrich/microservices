package com.wanwan.location;

import java.time.LocalDate;

public record LocationRegistrationRequest(
        String county,
        String sub_county,
        double latitude,
        double longitude,
        LocalDate date) {
}
