package be.vdab.advancedtaken.repositories;

import be.vdab.advancedtaken.domain.Brouwer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrouwerRepository extends JpaRepository<Brouwer, Long> {
    List<Brouwer> findByNaamStartingWithOrderByNaam(String beginNaam);
}
