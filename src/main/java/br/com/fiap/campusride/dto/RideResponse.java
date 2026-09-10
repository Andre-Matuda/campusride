package br.com.fiap.campusride.dto;

import br.com.fiap.campusride.entity.Driver;
import br.com.fiap.campusride.entity.Ride;

import java.time.LocalDate;

public record RideResponse(
        Long id,
        Driver drive,
        String origin,
        String destiny,
        LocalDate departureTime,
        Integer seats
) {
    public static RideResponse fromEntity(Ride ride) {
        return new RideResponse(
                ride.getId(),
                ride.getDriver(),
                ride.getOrigin(),
                ride.getDestiny(),
                ride.getDepartureTime(),
                ride.getSeats()
        );
    }
}
