package com.flt.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author fenglingtong
 * @date 2018/7/23
 */
@Controller
public class UserController {
    @RequestMapping(value="/showname", method= RequestMethod.GET)
    public String showUserName(){
        System.out.println(1);
        return "2";
    }
}
