package br.com.fiap.campusride.dto;

import br.com.fiap.campusride.entity.Ride;

import java.time.LocalDateTime;

public record RideResponse(
        Long id,
        Long driveId,
        String origin,
        String destiny,
        LocalDateTime departureTime,
        Integer totalSeats
) {


    public static RideResponse fromEntity(Ride ride) {
        return new RideResponse(
                ride.getId(),
                ride.getDriverId(),
                ride.getOrigin(),
                ride.getDestiny(),
                ride.getDepartureTime(),
                ride.getTotalSeats()


        );
    }
}
