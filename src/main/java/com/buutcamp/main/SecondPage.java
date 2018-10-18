package com.buutcamp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecondPage {

    @RequestMapping(value = "/second-page", method = RequestMethod.GET)
    public String secondPageGET(Model model) {

        model.addAttribute("msg", "Hello second-page");
        model.addAttribute("varModel", "varModel 2");
        return "second-page";
    }
}
