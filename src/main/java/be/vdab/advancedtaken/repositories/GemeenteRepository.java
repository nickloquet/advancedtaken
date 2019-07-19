package be.vdab.advancedtaken.repositories;

import be.vdab.advancedtaken.domain.Gemeente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GemeenteRepository extends JpaRepository<Gemeente, Long> {
}
