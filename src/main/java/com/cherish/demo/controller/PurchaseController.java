package com.cherish.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {

    @GetMapping(value = "/apply")
    public String apply() {
        return "/purchase/apply";
    }

    @GetMapping(value = "/order")
    public String order() {
        return "/purchase/order";
    }

    @GetMapping(value = "/reconciliation")
    public String reconciliation() {
        return "/purchase/reconciliation";
    }
}
