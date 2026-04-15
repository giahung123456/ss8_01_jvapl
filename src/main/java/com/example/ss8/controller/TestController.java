package com.example.ss8.controller;

import com.example.ss8.model.dto.AddressDto;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {


    @GetMapping("/address")
    public String showAddressForm(Model model) {
        model.addAttribute("addressDto", new AddressDto());
        return "address-form";
    }

    @PostMapping("/address")
    public String handleAddress(@Valid @ModelAttribute("addressDto") AddressDto addressDto,
                                BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "address-form";
        }
        return "redirect:/hr/success";
    }


}