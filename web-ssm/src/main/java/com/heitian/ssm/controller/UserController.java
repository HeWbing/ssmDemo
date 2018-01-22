package com.heitian.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.heitian.ssm.model.User;
import com.heitian.ssm.model.UserTest;
import com.heitian.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser")
    @ResponseBody
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        JSONObject retJson = new JSONObject();
        List<User> userList = userService.getAllUser();
        retJson.put("userList",userList);
        return retJson.toJSONString();
    }

    @RequestMapping(value="/queryUserById")
    @ResponseBody
    public String queryUserById(HttpServletRequest request){
        JSONObject retJson = new JSONObject();
        // JSONObject jsonObject = JSON.parseObject(requestBody);
        long id = Long.parseLong(request.getParameter("id"));
        log.info("查询指定用户信息，查询id:"+id);
        UserTest user = userService.getUserById(id);
        log.info("查询到的用户信息："+user.toString());
        retJson.put("user", user);
        return retJson.toJSONString();
    }
}
