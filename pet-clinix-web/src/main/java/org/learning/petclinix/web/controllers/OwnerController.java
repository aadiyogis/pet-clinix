package org.learning.petclinix.web.controllers;

import org.learning.petclinix.data.model.Owner;
import org.learning.petclinix.data.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping("/")
    public String listOwner(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/list";
    }

    @RequestMapping("/find")
    public String findOwners() {
        return "notimplemented";
    }
}
