package be.vdab.advancedtaken.restservices;

import be.vdab.advancedtaken.domain.Gemeente;
import be.vdab.advancedtaken.exceptions.GemeenteNietGevondenException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/gemeenten")
public class GemeenteRestController {
    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE, value = "{gemeente}")
    public Gemeente read(@PathVariable Optional<Gemeente> gemeente){
        if(gemeente.isPresent()){
            return gemeente.get();
        }
        throw new GemeenteNietGevondenException();
    }

    @ExceptionHandler(GemeenteNietGevondenException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    void gemeenteNietGevonden(){}
}
