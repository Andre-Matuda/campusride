package br.com.fiap.campusride.controller;

import br.com.fiap.campusride.dto.RideRequest;
import br.com.fiap.campusride.dto.RideResponse;
import br.com.fiap.campusride.service.RideService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rides")
public class RideController {

    private final RideService rideService;

    public RideController(RideService rideService) {
        this.rideService = rideService;
    }

    @PostMapping
    public ResponseEntity<RideResponse> create(@RequestBody @Valid RideRequest request) {
        return rideService.create(rideRequest.toEntity);
    }

    @GetMapping
    public List<RideResponse> findAll() {
        return rideService.findAll()
                .stream()
                .map(RideResponse::fromEntity)
                .toList();
    }
}