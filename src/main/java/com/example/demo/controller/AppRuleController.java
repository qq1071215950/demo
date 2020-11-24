package com.example.demo.controller;

import com.example.demo.vo.AppRuleVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiange
 * @date 2020/10/16 13:22
 */
@RestController
@RequestMapping("/appRule")
public class AppRuleController {

    @RequestMapping(value = "/saveAppRules", method = RequestMethod.POST)
    public String saveAppRules(@RequestBody AppRuleVO appRuleVO){
        System.out.println("可以访问到");
        System.out.println("app的名称："+ appRuleVO.getAppRuleName());
        System.out.println("访问结束");
        return "ok";
    }
}
