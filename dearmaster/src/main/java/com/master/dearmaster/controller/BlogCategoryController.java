package com.master.dearmaster.controller;

import com.master.dearmaster.model.BlogCategory;
import com.master.dearmaster.util.LoggerFactory;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static com.master.dearmaster.Constants.SESSION_LOGIN_USER;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("blogCategory")
public class BlogCategoryController {

    private static final Logger logger = LoggerFactory.getLogger();

    /*@RequestMapping(method = RequestMethod.GET, value = "load")
    @ResponseBody
    public List<BlogCategory> findAll(Model model, HttpServletRequest request, HttpSession session) {

        String loginId = (String) session.getAttribute(SESSION_LOGIN_USER);

        if(logger.isDebugEnabled()) {
            logger.debug("login user: " + loginId);
        }

        List<BlogCategory> list = mockupAll();
        if(logger.isDebugEnabled()) {
            logger.debug(list);
        }
        return list;
    }*/

    @RequestMapping(method = GET, value = "load/{blogowner}")
    @ResponseBody
    public List<BlogCategory> findAll(HttpSession session, @PathVariable String blogowner) {

        if(logger.isDebugEnabled()) {
            String loginId = (String) session.getAttribute(SESSION_LOGIN_USER);
            logger.debug(loginId + " is querying the list of blog categories of " + blogowner);
        }

        List<BlogCategory> list = mockupAll();
        if(logger.isDebugEnabled()) {
            logger.debug(list);
        }
        return list;
    }

    private List<BlogCategory> mockupAll() {
        List<BlogCategory> list = new ArrayList<>();
        list.add(new BlogCategory("日常笔记"));
        list.add(new BlogCategory("工作"));
        list.add(new BlogCategory("生活"));
        list.add(new BlogCategory("旅游"));
        return list;
    }

}