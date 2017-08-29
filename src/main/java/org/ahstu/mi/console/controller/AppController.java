package org.ahstu.mi.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by xiezg@317hu.com on 2017/8/29 0029.
 */
@Controller
@RequestMapping("app")
public class AppController {

    @RequestMapping("list")
    public String list(Map<String, Object> map) {
        map.put("mi", "小米之家");
        return "app/list";
    }
}
