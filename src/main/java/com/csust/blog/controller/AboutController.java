package com.csust.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wq
 * @date 2020/2/14 23:14
 */
@Controller
public class AboutController {
    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
