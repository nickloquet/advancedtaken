package be.vdab.advancedtaken.services;

import be.vdab.advancedtaken.domain.Bestelling;
import be.vdab.advancedtaken.repositories.BestellingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, isolation = Isolation.READ_COMMITTED)
public class DefaultBestellingService implements BestellingService{
    private BestellingRepository repository;

    public DefaultBestellingService(BestellingRepository repository) {
        this.repository = repository;
    }

    @Override @Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED)
    public void create(Bestelling bestelling){
        repository.save(bestelling);
    }
}
