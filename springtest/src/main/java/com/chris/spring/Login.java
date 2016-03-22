package com.chris.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chris on 16/3/13.
 */
@Controller
public class Login {

    @RequestMapping(value = "login")
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView("welcome");
        mav.addObject("message", "hello 刘梦竹小坏蛋");
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("c++");
        list.add("python");
        mav.addObject("booklist", list);
        Map<String, String> map = new HashMap<String, String>();
        map.put("gansu", "lanzhou");
        map.put("zhejiang", "hangzhou");
        map.put("湖北", "武汉");
        mav.addObject("map", map);
        mav.addObject("", "");
        return mav;
    }

}
