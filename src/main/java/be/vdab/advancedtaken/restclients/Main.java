package be.vdab.advancedtaken.restclients;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.math.BigDecimal;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Main {
    private BigDecimal temp;

    public void setTemp(BigDecimal temp) {
        this.temp = temp;
    }

    public BigDecimal getTemp() {
        return temp;
    }
}
