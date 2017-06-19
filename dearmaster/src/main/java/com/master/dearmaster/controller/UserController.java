package com.master.dearmaster.controller;

import com.master.dearmaster.model.User;
import com.master.dearmaster.service.UserService;
import com.master.dearmaster.util.LoggerFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

import static com.master.dearmaster.Constants.SESSION_LOGIN_USER;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("user")
@SessionAttributes(SESSION_LOGIN_USER)
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger();

    @Autowired
    private UserService userService;

    @RequestMapping(method = GET, value = "load")
    @ResponseBody
    public List<User> findAll() {
        List<User> list = userService.findAll();
        if(logger.isDebugEnabled()) {
            logger.debug(list);
        }
        return list;
    }

    @RequestMapping(value="/login", method=GET)
    @ResponseBody
    public String login(Model model, HttpSession session) {
        model.addAttribute(SESSION_LOGIN_USER, "Lesly");
        return "SUCCESS";
    }

}