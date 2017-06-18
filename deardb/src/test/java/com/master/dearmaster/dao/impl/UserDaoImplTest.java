package com.master.dearmaster.dao.impl;

import com.master.dearmaster.dao.UserDao;
import com.master.dearmaster.model.User;
import com.master.dearmaster.util.LoggerFactory;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Transactional
@Rollback(false)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/dataSource.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDaoImplTest {

    @Autowired
    private UserDao userDao;
    private User user;
    private static final Logger logger = LoggerFactory.getLogger();

    @Before
    public void setUp() throws Exception {
        user = new User("lucy", "Lucy Xu", "女", "Shanghai", "lucy.xu@eduoer.com", "15028382321", getDate("1990-05-20"));
    }

    private Date getDate(String date) {
        Date parseRst = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            parseRst = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parseRst;
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test2FindAll() throws Exception {
        logger.debug("------------------");
        List<User> users = userDao.findAll();
        for(User user: users) {
            System.out.println(user);
        }
    }

    @Test
    public void test1Save() throws Exception {
        userDao.save(user);
    }

    @Test
    public void test4Delete() throws Exception {
        logger.info("test");
    }

    @Test
    public void test3Update() throws Exception {

    }

}