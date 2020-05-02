package com.example.gmalluser.controller;

import com.example.gmalluser.bean.UmsMember;
import com.example.gmalluser.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("/index")
    public String index() {
        return "hello user";
    }

    @GetMapping("/getAllUser")
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userService.getAllUser();

        return umsMembers;
    }

    @GetMapping("/getAllUser")
    public List<UmsMember> getReceiveAddressByMemberId() {
        List<UmsMember> umsMembers = userService.getAllUser();

        return umsMembers;
    }
}
