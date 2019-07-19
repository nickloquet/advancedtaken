package be.vdab.advancedtaken.repositories;

import be.vdab.advancedtaken.domain.Bestelling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BestellingRepository extends JpaRepository<Bestelling, Long> {
}
