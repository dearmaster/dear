package com.master.dearmaster.service.impl;

import com.master.dearmaster.model.User;
import com.master.dearmaster.service.UserService;
import com.master.dearmaster.util.DateHelper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    public List<User> findAll() {
        //mockup data for testing purpose
        final User user = new User("lucy", "Lucy Xu", "女", "Shanghai", "lucy.xu@eduoer.com", "15028382321", DateHelper.parseStripingSeparateDateString("1990-05-20"));
        return new ArrayList<User>(){{add(user);}};
    }

}