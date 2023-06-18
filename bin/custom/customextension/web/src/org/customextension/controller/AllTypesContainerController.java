package org.customextension.controller;

import org.customextension.data.AllTypesContainerData;
import org.customextension.facade.AllTypesContainerFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/types")
@Controller
public class AllTypesContainerController {

    @Resource
    private AllTypesContainerFacade allTypesContainerFacade;

    @GetMapping("/")
    public String getAllTypes(Model model) {
        List<AllTypesContainerData> allTypesList = allTypesContainerFacade.findAll();
        model.addAttribute("allTypesList", allTypesList);

        return "types";
    }
}
