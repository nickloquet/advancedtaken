package be.vdab.advancedtaken.controllers;

import be.vdab.advancedtaken.services.BrouwerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
    private final char[] alfabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ".toCharArray();
    private final BrouwerService service;

    public IndexController(BrouwerService service) {
        this.service = service;
    }

    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("index", "alfabet", alfabet);
    }
    @GetMapping("alfabet/{letter}")
    public ModelAndView brouwers(@PathVariable String letter){
        return new ModelAndView("index", "alfabet", alfabet)
                .addObject("brouwers", service.findByBeginNaam(String.valueOf(letter)));
    }
}
