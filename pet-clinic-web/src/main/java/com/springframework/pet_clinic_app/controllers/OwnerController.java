package com.springframework.pet_clinic_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class OwnerController {
    @RequestMapping({"/owners","/owners/index","owners/index.html"})
    public String listOwner() {
        return "owners/index";
    }
}
