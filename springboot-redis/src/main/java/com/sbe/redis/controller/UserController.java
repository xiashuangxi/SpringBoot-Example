package com.sbe.redis.controller;

import com.sbe.redis.dto.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@RestController
public class UserController {

    @RequestMapping("/getUser")
    @Cacheable(value="user-key")
    public User getUser() {
        User user = new User("user","pwd");
        return user;
    }

    @RequestMapping("/uid")
    public String uid(HttpSession session){
        UUID uid = (UUID) session.getAttribute("uid");
        if (null == uid){
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid",uid);
        return session.getId();
    }
}
