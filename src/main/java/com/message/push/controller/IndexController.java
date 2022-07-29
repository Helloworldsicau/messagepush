package com.message.push.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@RestController
public class IndexController {

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mav=new ModelAndView("socket");
        mav.addObject("uid", new Random().nextInt());
        return mav;
    }

}