package com.wo.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    @RequestMapping(value = "/order")
    public String order() {
        return "order/order";
    }

}