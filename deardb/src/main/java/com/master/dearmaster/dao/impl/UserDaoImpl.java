package com.master.dearmaster.dao.impl;

import com.master.dearmaster.dao.AbstractBaseDaoSupport;
import com.master.dearmaster.dao.UserDao;
import com.master.dearmaster.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl extends AbstractBaseDaoSupport implements UserDao {

    public List<User> findAll() {
        return super.findAll(User.class);
    }

}