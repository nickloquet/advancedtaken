package be.vdab.advancedtaken.services;

import be.vdab.advancedtaken.domain.Gemeente;
import be.vdab.advancedtaken.repositories.GemeenteRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional(readOnly = true, isolation = Isolation.READ_COMMITTED)
public class DefaultGemeenteService implements GemeenteService{
    private GemeenteRepository repository;

    public DefaultGemeenteService(GemeenteRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Gemeente> findAll(){
        return repository.findAll(Sort.by("naam", "postcode"));
    }
}
