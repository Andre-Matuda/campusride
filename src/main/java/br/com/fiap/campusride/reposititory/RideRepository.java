package br.com.fiap.campusride.reposititory;

import br.com.fiap.campusride.entity.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride, Long> {

}
