package com.we.shopservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 莫
 */
@RestController
public class CommodityController {
    @RequestMapping("/")
    public String hello(){
        return "hello";
    }

}
