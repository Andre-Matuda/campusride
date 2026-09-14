package br.com.fiap.campusride.reposititory;

import br.com.fiap.campusride.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
