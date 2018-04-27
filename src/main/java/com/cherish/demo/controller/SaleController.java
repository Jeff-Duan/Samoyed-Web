package com.cherish.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sale")
public class SaleController {

    @GetMapping(value = "/apply")
    public String apply() {
        return "/sale/apply";
    }

    @GetMapping(value = "/order")
    public String order() {
        return "/sale/order";
    }

    @GetMapping(value = "/reconciliation")
    public String reconciliation() {
        return "/sale/reconciliation";
    }

}
