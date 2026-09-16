package br.com.fiap.campusride.dto;

import br.com.fiap.campusride.entity.Reservation;
import br.com.fiap.campusride.enums.RideReservation;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ReservationRequest(
    @NotNull
    Long id

) {
    public Reservation toEntity() {
        return Reservation.builder()
                .id(id)
                .build();
    }
}
