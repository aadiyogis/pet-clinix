package org.learning.petclinix.web.controllers;

import org.learning.petclinix.data.model.Vet;
import org.learning.petclinix.data.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
@RequestMapping("/vets")
public class VetsController {

    @RequestMapping("/")
    public String getVets() {
        return "vets/list";
    }
}
