package org.ahstu.mi.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by xiezg@317hu.com on 2017/8/29 0029.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("list")
    public String list(Map<String,Object> model) {
        model.put("mi_control","运维管理系统（用户管理、应用管理、机器管理、环境管理），后续集成配置中心，API管理系统");
        return "user/list";
    }
}
