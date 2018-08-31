package com.app.application.controller;

import com.app.application.mapper.UserMapper;
import com.app.application.model.User;
import com.app.common.utlis.web.ParamUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@Slf4j
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("user")
    public User getUserByID(HttpServletRequest request) {
        int id = ParamUtils.getInt(request, "id", 0);
        return userMapper.selectByPrimaryKey(id);
    }

    @RequestMapping("list")
    public String list(ModelMap modelMap) {

        PageHelper.startPage(1, 10);
        List<User> users = userMapper.selectAll();
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        List<User> list = userPageInfo.getList();
        log.debug(list.toString());
        modelMap.addAttribute("pageInfo",userPageInfo);
        return "list";
    }

    @RequestMapping(value = "save",method = RequestMethod.POST)
    @ResponseBody
    public String save(User user) {

        int insert = userMapper.insert(user);

        log.debug(String.valueOf(insert));

        return "ok";
    }

}
