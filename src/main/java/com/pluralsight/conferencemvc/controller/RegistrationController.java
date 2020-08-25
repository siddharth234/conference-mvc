package com.pluralsight.conferencemvc.controller;

import com.pluralsight.conferencemvc.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration) {
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute("registration") Registration registration) {
        System.out.println("Registration: " + registration.getName());
        return "redirect:registration";
    }

}

// TODO: https://stackoverflow.com/questions/2769467/what-is-dispatcher-servlet-in-spring