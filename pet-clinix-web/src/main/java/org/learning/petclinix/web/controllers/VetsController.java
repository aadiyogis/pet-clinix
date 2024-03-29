package org.learning.petclinix.web.controllers;

import org.learning.petclinix.data.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    private final VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets.html"})
    public String getVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/list";
    }
}
