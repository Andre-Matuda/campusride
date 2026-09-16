package br.com.fiap.campusride.service;

import br.com.fiap.campusride.dto.RideRequest;
import br.com.fiap.campusride.entity.Ride;
import br.com.fiap.campusride.enums.RideSituation;
import br.com.fiap.campusride.reposititory.RideRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideService {

    private final RideRepository rideRepository;

    public RideService(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    public Ride create(Ride ride) {
        return rideRepository.save(ride);
    }

    public List<Ride> findAll() {
        return rideRepository.findAll();
    }
}