package com.master;

import com.master.dearmaster.dao.UserDao;
import com.master.dearmaster.model.User;
import com.master.dearmaster.util.LoggerFactory;
import org.apache.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Rollback(false)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/dataSource.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestDemo {

    @Autowired
    private UserDao userDao;
    private static final Logger logger = LoggerFactory.getLogger(TestDemo.class);

    @Test
    public void test2FindAll() throws Exception {
        logger.debug("------------------");
        List<User> users = userDao.findAll();
        for(User user: users) {
            System.out.println(user);
        }
    }

}
