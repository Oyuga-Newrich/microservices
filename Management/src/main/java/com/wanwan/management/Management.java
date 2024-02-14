package com.wanwan.management;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Management {
    @Id
    @SequenceGenerator(
            name = "management_id_sequence",
            sequenceName = "management_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "management_id_sequence"
    )
    private Integer id;
    private String username;
    private String email;
    private String password_hash;
}
