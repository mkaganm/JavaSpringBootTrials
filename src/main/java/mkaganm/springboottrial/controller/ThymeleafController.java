package mkaganm.springboottrial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    // * http://localhost:8080/thymeleaf_
    // @ResponseBody
    @GetMapping("/thymeleaf_")
    public String getThymeleaf_() {
        return "thymeleaf_";
    }

    // * http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2(Model model) {
        model.addAttribute("key_model", "model value");
        return "thymeleaf2";
    }
}
