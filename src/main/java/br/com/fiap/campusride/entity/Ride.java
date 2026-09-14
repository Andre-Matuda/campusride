package br.com.fiap.campusride.entity;

import br.com.fiap.campusride.enums.RideSituation;
import br.com.fiap.campusride.enums.VehicleType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Entity
@Builder              // <-- Cria o método builder()
@NoArgsConstructor    // <-- Exigido pelo JPA
@AllArgsConstructor   // <-- OBRIGATÓRIO quando usado com @Builder e @NoArgsConstructor
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long driverId;
    private String origin;
    private String destiny;
    private LocalDateTime departureTime;

    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

    private Integer totalSeats;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private RideSituation status = RideSituation.OPEN;
}