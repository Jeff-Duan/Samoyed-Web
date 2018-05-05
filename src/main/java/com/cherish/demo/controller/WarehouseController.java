package com.cherish.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/warehouse")
public class WarehouseController {

    @GetMapping(value = "/storage-purchase")
    public String storagePurchase() {
        return "/warehouse/storage-purchase";
    }

    @GetMapping(value = "/storage-produce")
    public String storageProduce() {
        return "/warehouse/storage-produce";
    }

    @GetMapping(value = "/issue-produce")
    public String issueProduce() {
        return "/warehouse/issue-produce";
    }

    @GetMapping(value = "/issue-sale")
    public String issueSale() {
        return "/warehouse/issue-sale";
    }

    @GetMapping(value = "/detail")
    public String detail() {
        return "/warehouse/detail";
    }

}
