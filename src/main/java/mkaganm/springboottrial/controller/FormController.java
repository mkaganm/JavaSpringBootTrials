package mkaganm.springboottrial.controller;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import mkaganm.springboottrial.dto.TeacherDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Log4j2
@Controller
public class FormController {

    //FORM
    // @GetMapping
    // @PostMapping
    // @PutMapping
    // @DeleteMapping


    //getMethod
    // http://localhost:8080/form
    @GetMapping("/form")
    public String getForm(Model model) {
        model.addAttribute("cv_teacher", new TeacherDto());
        return "form_post/formvalidation";
    }


    //PostMethod
    // http://localhost:8080/form
    @PostMapping("/form")
    public String postForm(@Valid @ModelAttribute("cv_teacher") TeacherDto teacherDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            log.error("Hata var ....");
            System.err.println("Hata var ....");
            return "form_post/formvalidation";
        }
        log.info("Success !"+teacherDto);
        return "form_post/success";
    }


}
