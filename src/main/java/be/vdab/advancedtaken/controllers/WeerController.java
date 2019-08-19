package be.vdab.advancedtaken.controllers;

import be.vdab.advancedtaken.exceptions.KanTemperatuurNietLezenException;
import be.vdab.advancedtaken.services.WeerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("weer")
public class WeerController {
    private final WeerService service;

    public WeerController(WeerService service) {
        this.service = service;
    }

    @GetMapping("{plaats}/temperatuur")
    public ModelAndView temperatuur(@PathVariable String plaats){
        ModelAndView modelAndView = new ModelAndView("temperatuur");
        try{
            modelAndView.addObject("temperatuur", service.getTemperatuur(plaats));
        }catch (KanTemperatuurNietLezenException ex){
        }
        return modelAndView;
    }
}
