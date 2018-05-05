package com.cherish.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/finance")
public class FinanceController {

    @GetMapping(value = "/pay-purchase")
    public String payPurchase() {
        return "/finance/pay-purchase";
    }

    @GetMapping(value = "/receivable-purchase")
    public String receivablePurchase() {
        return "/finance/receivable-purchase";
    }

     @GetMapping(value = "/pay-sale")
    public String paySale() {
        return "/finance/pay-sale";
    }

    @GetMapping(value = "/receivable-sale")
    public String receivableSale() {
        return "/finance/receivable-sale";
    }

    @GetMapping(value = "/reconciliation")
    public String reconciliation() {
        return "/finance/reconciliation";
    }

}
