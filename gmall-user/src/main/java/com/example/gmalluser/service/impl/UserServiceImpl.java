package com.example.gmalluser.service.impl;

import com.example.gmalluser.bean.UmsMember;
import com.example.gmalluser.mapper.UserMapper;
import com.example.gmalluser.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll(); //userMapper.selectAllUser();

        return umsMembers;
    }
}
