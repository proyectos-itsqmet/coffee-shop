package com.itsqmet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itsqmet.models.ClientModel;
import com.itsqmet.models.ContactModel;

import org.springframework.ui.Model;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/cs")
public class CoffeShopController {

    @GetMapping("/contact")
    public String contact(Model model) {
        ContactModel contact = new ContactModel();
        model.addAttribute("contact", contact);
        return "pages/contactForm";
    }

    @GetMapping("/register")
    public String register(Model model) {
        ClientModel register = new ClientModel();
        model.addAttribute("register", register);

        return "pages/registerForm";
    }

    @PostMapping("/submitContact")
    public String submitContact(@Valid @ModelAttribute("contact") ContactModel contact, BindingResult bindingResult,
            Model model) {
        if (bindingResult.hasErrors()) {
            return "pages/contactForm";
        } else {
            return "home";
        }
    }

    @PostMapping("/submitRegister")
    public String submitRegister(@Valid @ModelAttribute("register") ClientModel register, BindingResult bindingResult,
            Model model) {
        if (bindingResult.hasErrors()) {
            return "pages/registerForm";
        } else {
            return "home";
        }
    }
}
