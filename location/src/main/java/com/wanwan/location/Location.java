package com.wanwan.location;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Location {
    @Id
    @SequenceGenerator(
            name = "location_id_sequence",
            sequenceName = "location_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "location_id_sequence"
    )
    private Integer id;
    private String county;
    private String sub_county;
    private double latitude;
    private double longitude;

}
