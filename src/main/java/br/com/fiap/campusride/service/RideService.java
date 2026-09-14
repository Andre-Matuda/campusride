package br.com.fiap.campusride.service;

import br.com.fiap.campusride.dto.RideRequest;
import br.com.fiap.campusride.entity.Ride;
import br.com.fiap.campusride.enums.RideSituation;
import br.com.fiap.campusride.reposititory.RideRepository;
import org.springframework.stereotype.Service;

@Service
public class RideService {

    private final RideRepository rideRepository;

    public RideService(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    public Ride create(RideRequest request) {
        Ride ride = Ride.builder()
                .driverId(request.driverId())
                .origin(request.origin())
                .destiny(request.destiny())
                .departureTime(request.departureTime())
                .vehicleType(request.vehicleType())
                .totalSeats(request.totalSeats())
                .status(RideSituation.OPEN)
                .build();

        return rideRepository.save(ride);
    }
}