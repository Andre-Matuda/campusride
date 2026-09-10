package br.com.fiap.campusride.controller;

import br.com.fiap.campusride.dto.RideResponse;
import br.com.fiap.campusride.entity.Ride;
import br.com.fiap.campusride.service.RideService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ride")
@RequiredArgsConstructor
public class RideController {

    private final RideService rideService;

    @GetMapping
    public List<RideResponse>findAll() {
        return rideService.findAll()
                .stream()
                .map(RideResponse::fromEntity)
                .toList();
    }

    @PostMapping
    public Ride create(@RequestBody @Valid Re)
}
