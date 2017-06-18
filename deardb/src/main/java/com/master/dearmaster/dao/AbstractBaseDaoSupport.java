package com.master.dearmaster.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractBaseDaoSupport<T> implements BaseDao<T> {

    @Autowired
    protected SessionFactory sessionFactory;

    public List<T> findAll(Class<T> c) {
        Session session = getSession();
        String hql = "from " + c.getSimpleName();
        List<T> list = session.createQuery(hql).list();
        return list;
    }

    public void save(T t) {
        Session session = getSession();
        session.save(t);
    }

    public void delete(T t) {
        Session session = getSession();
        session.delete(t);
    }

    public void update(T t) {
        Session session = getSession();
        session.update(t);
    }

    private final Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}