package com.cherish.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/warehouse")
public class WarehouseController {

    @GetMapping(value = "/storage")
    public String storage() {
        return "/warehouse/storage";
    }

    @GetMapping(value = "/issue")
    public String issue() {
        return "/warehouse/issue";
    }

    @GetMapping(value = "/detail")
    public String detail() {
        return "/warehouse/detail";
    }

}
