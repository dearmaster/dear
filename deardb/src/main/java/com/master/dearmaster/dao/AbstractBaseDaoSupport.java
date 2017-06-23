package com.master.dearmaster.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractBaseDaoSupport implements BaseDao {

    @Autowired
    protected SessionFactory sessionFactory;

    public <T> List<T> findAll(final Class<T> c) {
        return this.execute(new DaoCallBack<List<T>>() {
            @Override
            public List<T> doInAction(Session session) {
                String hql = "from " + c.getSimpleName();
                return session.createQuery(hql).list();
            }
        });
    }

    public <T> Serializable save(final T t) {
        return this.execute(new DaoCallBack<Serializable>() {
            @Override
            public Serializable doInAction(Session session) {
                return session.save(t);
            }
        });
    }

    public <T> void delete(final T t) {
        this.execute(new DaoCallBack<Void>() {
            @Override
            public Void doInAction(Session session) {
                session.delete(t);
                return null;
            }
        });
    }

    public <T> void update(final T t) {
        this.execute(new DaoCallBack<Void>() {
            @Override
            public Void doInAction(Session session) {
                session.update(t);
                return null;
            }
        });
    }

    public <T> T execute(DaoCallBack<T> action) {
        Session session = getSession();
        return action.doInAction(session);
    }

    private final Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}