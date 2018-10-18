package com.buutcamp.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FrontPage {

    @Value("${custom}")
    private String custom;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String frontPageGET(Model model) {

        model.addAttribute("msg", "Hello front-page");
        //model.addAttribute("varModel", custom);

        List<String> simpleList = new ArrayList<String>();
        simpleList.add("I am first string");
        simpleList.add("I am second string");
        simpleList.add("I am third string");
        simpleList.add("I am fourth string");
        model.addAttribute("simpleList", simpleList);

        return "front-page";
    }
    @RequestMapping(value="/", method = RequestMethod.POST)
    public String frontPagePOST(@RequestParam("request") String str, Model model) {

        model.addAttribute("msg", "Hello front-page2");
        //model.addAttribute("varModel", "varModel 2");
        model.addAttribute("varModel", str);
        return "front-page";
    }

}
