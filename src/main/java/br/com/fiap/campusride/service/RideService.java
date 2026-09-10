package br.com.fiap.campusride.service;

import br.com.fiap.campusride.entity.Ride;
import br.com.fiap.campusride.entity.RideSituation;
import br.com.fiap.campusride.repostitory.RideRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RideService {
    private final RideRepository rideRepository;

    public Ride create(Ride ride) {
        return rideRepository.save(ride);
    };

    public List<Ride> findAll() {
        return rideRepository.findAll();
    };

}
