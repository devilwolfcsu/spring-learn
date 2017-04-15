package com.liangwei.learning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liangwei on 2017/4/11.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {

        //System.out.println(body);
        //System.out.println(body);
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
}
