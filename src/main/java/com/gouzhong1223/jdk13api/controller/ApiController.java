package com.gouzhong1223.jdk13api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : ApiController
 * @Date : create by QingSong in 2020-02-21 12:19 上午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.jdk13api.controller
 * @ProjectName : jdk13-api
 * @Version : 1.0.0
 */
@Controller
public class ApiController {

    @RequestMapping("/")
    public String getApi() {
        return "index.html";
    }
}
