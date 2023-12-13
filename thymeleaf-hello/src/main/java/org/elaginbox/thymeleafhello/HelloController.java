package org.elaginbox.thymeleafhello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello Steve!");
        return "helloworld";
    }

    @GetMapping("/shares")
    public String shares(Model model) {
        model.addAttribute("price", "5.92");
        return "shares";
    }

}


