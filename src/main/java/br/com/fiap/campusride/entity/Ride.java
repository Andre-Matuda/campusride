package br.com.fiap.campusride.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Locale;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ride extends Driver{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Driver driver;
    private String origin;
    private String destiny;
    private LocalDate departureTime;
    private Integer seats;
}
