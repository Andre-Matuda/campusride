package br.com.fiap.campusride.dto;

import br.com.fiap.campusride.enums.VehicleType;
import br.com.fiap.campusride.enums.VehicleType;
import br.com.fiap.campusride.validation.VehicleCapacity;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@VehicleCapacity
public record RideRequest(
        @NotNull(message = "O motorista é obrigatório")
        Long driverId,

        @NotBlank(message = "A origem não pode estar em branco")
        String origin,

        @NotBlank(message = "O destino não pode estar em branco")
        String destiny,

        @NotNull(message = "O horário de partida é obrigatório")
        @Future(message = "O horário de partida deve ser uma data e hora futura")
        LocalDateTime departureTime,

        @NotNull(message = "O tipo de veículo é obrigatório")
        br.com.fiap.campusride.enums.VehicleType vehicleType,

        @NotNull(message = "A quantidade de vagas é obrigatória")
        @Min(value = 1, message = "A carona deve ter ao menos 1 vaga")
        Integer totalSeats
) {}