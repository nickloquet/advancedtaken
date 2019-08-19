package be.vdab.advancedtaken.restclients;

import be.vdab.advancedtaken.exceptions.KanTemperatuurNietLezenException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Component
public class OpenWeatherMapClient implements WeerClient{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final String uriTemplate;
    private final RestTemplate restTemplate;

    public OpenWeatherMapClient(@Value("${openWeatherMapURL}") String uriTemplate,
                                RestTemplateBuilder restTemplateBuilder) {
        this.uriTemplate = uriTemplate;
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public BigDecimal getTemperatuur(String plaats){
        try{
            Weer weer = restTemplate.getForObject(uriTemplate, Weer.class, plaats);
            return weer.getMain().getTemp();
        } catch (Exception ex){
            logger.error("kan temperatuur niet lezen", ex);
            throw new KanTemperatuurNietLezenException();
        }
    }
}
