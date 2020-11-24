package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Soundbank;

/**
 * @author jiange
 * @date 2020/10/14 10:54
 */
@RestController
@RequestMapping("/tag")
public class TagController {

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public String querySku(
            @RequestParam(required = false) UserVO userVO,
            @RequestParam(required = false) String orderId,
            @RequestParam(required = false) String skuCode,
            @RequestParam(required = false) String price
    ) {

        System.out.println("订单号:" + orderId);
        System.out.println("商品编码: " + skuCode);
        System.out.println("商品价格: " + price);
        System.out.println("用户id:" + userVO.getId());
        System.out.println("用户名称：" + userVO.getUserName());
        return "ok";
    }

    @RequestMapping("/test")
    public String queryTest(){
        return "tag-test";
    }
}
