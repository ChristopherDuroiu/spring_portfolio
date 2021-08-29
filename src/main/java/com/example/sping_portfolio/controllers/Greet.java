package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Greet {
    @GetMapping("/greet")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String greeting(
            @RequestParam(name="namein", required=false, defaultValue="First") String name,
            @RequestParam(name="namein1", required=false, defaultValue="Last") String name1,
            Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("nameout", name+" "+name1); // MODEL is passed to html
        return "greet"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/greet2")
    public String greeting2(){

        return "greet2";
    }
}