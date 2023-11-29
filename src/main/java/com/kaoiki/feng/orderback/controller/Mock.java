package com.kaoiki.feng.orderback.controller;

import com.kaoiki.feng.orderback.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author      Ka01Ki
 * @className   Mock
 * @desc        模拟
 * @date        2023-11-29 7:30 上午
 **/

@RestController
@RequestMapping("/mock")
public class Mock {

    @GetMapping("/greeting")
    public Person getMyGreeting() {
        return new Person("john",30);
    }

    @PostMapping("/create")
    public Person letCreate() {
        return new Person("mary",40);
    }


}
