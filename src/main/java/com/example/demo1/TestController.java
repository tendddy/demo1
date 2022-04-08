package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author a421533
 * @date 2022/4/8 11:53
 */
@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping("1")
    public String t() {
        return "1";
    }
}
