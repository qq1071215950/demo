package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiange
 * @date 2020/11/16 22:24
 */
@RestController
@RequestMapping("/para")
public class ParmContorller {

    @RequestMapping("/get")
    public String getStr(@RequestParam(required = true) String id){
        return "ok";
    }
}
