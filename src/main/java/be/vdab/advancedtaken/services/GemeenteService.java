package be.vdab.advancedtaken.services;

import be.vdab.advancedtaken.domain.Gemeente;
import java.util.List;

public interface GemeenteService{
    List<Gemeente> findAll();
}
