package com.cherish.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/finance")
public class FinanceController {

    @GetMapping(value = "/pay")
    public String pay() {
        return "/finance/pay";
    }

    @GetMapping(value = "/receivable")
    public String receivable() {
        return "/finance/receivable";
    }

    @GetMapping(value = "/reconciliation")
    public String reconciliation() {
        return "/finance/reconciliation";
    }

}
