package be.vdab.advancedtaken.services;

import be.vdab.advancedtaken.domain.Brouwer;
import java.util.List;

public interface BrouwerService {
    List<Brouwer> findByBeginNaam(String beginNaam);
    void update(Brouwer brouwer);
}
