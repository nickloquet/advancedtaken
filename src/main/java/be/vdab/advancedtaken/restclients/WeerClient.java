package be.vdab.advancedtaken.restclients;

import java.math.BigDecimal;

public interface WeerClient {
    BigDecimal getTemperatuur(String plaats);
}
