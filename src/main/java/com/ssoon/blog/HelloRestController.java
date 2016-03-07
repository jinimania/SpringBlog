package com.ssoon.blog;

import com.ssoon.blog.domain.model.entity.Hello;
import com.ssoon.blog.infrastructure.dao.HelloDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloRestController {
    @Autowired
    private HelloDao helloDao;

    @RequestMapping("/add")
    public Hello add(Hello hello) {
        return helloDao.save(hello);
    }

    @RequestMapping("/list")
    public List<Hello> list() {
        return helloDao.findAll();
    }

    @RequestMapping(value = "/")
    public String index() {
        return "helloworld!";
    }
}
