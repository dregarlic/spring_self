package com.xu.controller;

import com.xu.config.ConfigBean;
import com.xu.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class MyController {

    @Value("${myConfig.myObject.myName}")
    private String myName;

    @Value("${myConfig.myObject.myAge}")
    private String myAge;

    @Autowired
    private ConfigBean configBean;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Person getPerson() {

        Person p = new Person();
        p.setId(123);
        p.setName("xuwenlong");
        p.setBirthday(new Date());

        System.out.println(configBean.getMyAge());
        System.out.println(configBean.getMyName());
        System.out.println(configBean.getMySex());

        return p;
    }
}
