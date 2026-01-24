package maffile.co_tiktok.com.iot.tiktok.controller;

import maffile.co_tiktok.com.iot.tiktok.entity.userEntity;
import maffile.co_tiktok.com.iot.tiktok.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public List<userEntity> getuser(){
        return userMapper.selectList(null);
    }



}
