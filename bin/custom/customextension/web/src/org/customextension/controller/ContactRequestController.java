package org.customextension.controller;

import org.customextension.data.ContactRequestData;
import org.customextension.facade.ContactRequestFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@RequestMapping("/contactRequest")
@Controller
public class ContactRequestController {

    @Resource
    private ContactRequestFacade contactRequestFacade;

    @GetMapping
    public String findBySender(@RequestParam String sender, Model model) {
        ContactRequestData contactRequestData = contactRequestFacade.findBySender(sender);
        model.addAttribute("contactRequest", contactRequestData);
        return "contactRequest";
    }
}
