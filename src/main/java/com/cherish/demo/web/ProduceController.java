package com.cherish.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produce")
public class ProduceController {

    @GetMapping(value = "/plan")
    public String plan() {
        return "/produce/plan";
    }

    @GetMapping(value = "/work")
    public String work() {
        return "/produce/work";
    }

}
