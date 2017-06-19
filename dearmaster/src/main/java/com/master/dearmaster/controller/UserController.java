package com.master.dearmaster.controller;

import com.master.dearmaster.model.User;
import com.master.dearmaster.service.UserService;
import com.master.dearmaster.util.LoggerFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger();

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "load")
    @ResponseBody
    public List<User> findAll() {
        List<User> list = userService.findAll();
        if(logger.isDebugEnabled()) {
            logger.debug(list);
        }
        return list;
    }

}