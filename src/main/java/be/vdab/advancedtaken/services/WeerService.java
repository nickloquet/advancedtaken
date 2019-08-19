package be.vdab.advancedtaken.services;

import java.math.BigDecimal;

public interface WeerService {
    BigDecimal getTemperatuur(String plaats);
}
