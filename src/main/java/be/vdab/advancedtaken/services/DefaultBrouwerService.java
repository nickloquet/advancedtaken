package be.vdab.advancedtaken.services;

import be.vdab.advancedtaken.domain.Brouwer;
import be.vdab.advancedtaken.repositories.BrouwerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional(readOnly = true, isolation = Isolation.READ_COMMITTED)
public class DefaultBrouwerService implements BrouwerService {
    private final BrouwerRepository repository;

    public DefaultBrouwerService(BrouwerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Brouwer> findByBeginNaam(String beginNaam){
        return repository.findByNaamStartingWithOrderByNaam(beginNaam);
    }

    @Override @Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED)
    public void update(Brouwer brouwer){
        repository.save(brouwer);
    }
}
