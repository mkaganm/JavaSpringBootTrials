package mkaganm.springboottrial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    // * http://localhost:8080/thymeleaf_
    @GetMapping("/thymeleaf_")
    public String getThymeleaf_(){
        return "thymeleaf_";
    }
}
