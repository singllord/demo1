package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * description:
 * Created on 2019/7/4.
 *
 * @author singllord
 */
@RestController
public class ma {
    @RequestMapping(value = "/")
    public String main(){
        return "hollo";
    }
}
