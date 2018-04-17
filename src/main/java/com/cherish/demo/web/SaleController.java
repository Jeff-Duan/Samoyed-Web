package com.cherish.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sale")
public class SaleController {

    @GetMapping(value = "/order")
    public String order() {
        return "/sale/order";
    }

    @GetMapping(value = "/receivable")
    public String receivable() {
        return "/sale/receivable";
    }

    @GetMapping(value = "/issue")
    public String issue() {
        return "/sale/issue";
    }

    @GetMapping(value = "/cancel")
    public String cancel() {
        return "/sale/cancel";
    }

    @GetMapping(value = "/reconciliation")
    public String reconciliation() {
        return "/sale/reconciliation";
    }

}
