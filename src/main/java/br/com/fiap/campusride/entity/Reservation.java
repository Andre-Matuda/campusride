package br.com.fiap.campusride.entity;

import br.com.fiap.campusride.enums.RideReservation;
import br.com.fiap.campusride.enums.RideSituation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reservation extends Ride{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RideReservation status = RideReservation.CANCELED;


}
