package com.opleiding.dms2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/orders", method = RequestMethod.GET)

public class ControllerClass {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getAllOrders() {
        return "All orders";
    }

    @RequestMapping(value = "/{orderId}", method = RequestMethod.GET)
    @ResponseBody
    public String getOrder(@PathVariable final String orderId) {
        return "Order ID: " + orderId;
    }

    @RequestMapping(value = "/{orderId}/items", method = RequestMethod.GET)
    @ResponseBody
    public String getItemsByOrder(@PathVariable final String orderId) {
        return "Items for Order ID " + orderId;
    }

    @RequestMapping(value = "/{orderId}/items/{itemId}", method = RequestMethod.GET)
    @ResponseBody
    public String getItem(@PathVariable final String orderId, @PathVariable final String itemId) {
        return "Order ID: " + orderId + ", Item ID: " + itemId;
    }
}

