package mkaganm.springboottrial.controller;

import mkaganm.springboottrial.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    // * http://localhost:8080/
    // * http://localhost:8080/index
    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    // * http://localhost:8080/thymeleaf_
    // @ResponseBody
    @GetMapping("/thymeleaf1")
    public String getThymeleaf1() {
        return "thymeleaf1";
    }

    // * http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2(Model model) {
        model.addAttribute("key_model1", "model value1");
        model.addAttribute("key_model2", "model value2");
        return "thymeleaf2";
    }

    // * http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")
    public String getThymeleaf3(Model model) {
        model.addAttribute("key_model1", "model value1");
        model.addAttribute("key_model2", "model value2");
        return "thymeleaf_file/thymeleaf3";
    }

    // * http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4")
    public String getThymeleaf4(Model model) {
        model.addAttribute("key_model1", "model value1");
        model.addAttribute("key_model2", "model value2");
        return "thymeleaf4";
    }

    // * http://localhost:8080/thymeleaf5
    @GetMapping("/thymeleaf5")
    public String getThymeleaf5(Model model) {

        model.addAttribute("key_model1", "text1");
        model.addAttribute("key_model2", "text2");

        ProductDto productDto = ProductDto.builder()
                .productId(0L)
                .productName("Product Name")
                .productPrice(2500)
                .build();


        model.addAttribute("key_model3", productDto);
        return "thymeleaf5";
    }


    // * http://localhost:8080/thymeleaf6
    @GetMapping("/thymeleaf6")
    public String getThymeleaf6(Model model) {

        List<ProductDto> list = new ArrayList<>();
        list.add(ProductDto.builder().productId(0L).productName("Product Name0").productPrice(2000).build());
        list.add(ProductDto.builder().productId(1L).productName("Product Name1").productPrice(3000).build());
        list.add(ProductDto.builder().productId(2L).productName("Product Name2").productPrice(4000).build());
        list.add(ProductDto.builder().productId(3L).productName("Product Name3").productPrice(5000).build());

        model.addAttribute("key_model3", list);
        return "thymeleaf6";
    }

    // * http://localhost:8080/thymeleaf7/5
    // * http://localhost:8080/thymeleaf7/
    // * http://localhost:8080/thymeleaf7
    @GetMapping({"/thymeleaf7", "/thymeleaf7/", "/thymeleaf7/{id}"})
    public String getThymeleaf7(Model model, @PathVariable(name = "id", required = false) Long id) {

        if (id != null) model.addAttribute("key_model1", "id : " + id);
        else model.addAttribute("key_model1", "id : not found");

        return "thymeleaf7";
    }

    // * http://localhost:8080/thymeleaf8?id=4
    @GetMapping({"/thymeleaf8"})
    public String getThymeleaf8(Model model, @RequestParam(name = "id") Long id) {

        if (id != null) model.addAttribute("key_model1", "id : " + id);
        else model.addAttribute("key_model1", "id : not found");

        return "thymeleaf8";
    }
}
