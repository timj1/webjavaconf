package com.buutcamp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontPage {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String frontPageGET(Model model) {

        model.addAttribute("msg", "Hello front-page");
        model.addAttribute("varModel", "varModel");
        return "front-page";
    }
    @RequestMapping(value="/", method = RequestMethod.POST)
    public String frontPagePOST(@RequestParam("request") String str, Model model) {

        model.addAttribute("msg", "Hello front-page2");
        //model.addAttribute("varModel", "varModel 2");
        model.addAttribute("varModel", str);
        return "front-page";
    }
    @RequestMapping(value="/second-page", method = RequestMethod.GET)
    public String secondPageGET (Model model) {

        model.addAttribute("msg", "Hello second-page");
        model.addAttribute("varModel", "varModel 2");

        return "second-page";
    }
}
