package com.shiva.application.trip.feedback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255, nullable = true)
    private String name;

    @Column(length = 500, nullable = true)
    private String good;

    @Column(length = 500, nullable = true)
    private String bad;

    @Column(length = 500, nullable = true)
    private String suggestions;

    @Column(length = 25, nullable = true)
    private String nextTrip;

    @Column(length = 50, nullable = true)
    private String tripWhen;


}
