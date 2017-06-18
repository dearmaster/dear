package com.master.dearmaster.dao;

import java.util.List;

public interface BaseDao<T> {

    List<T> findAll();
    void save(T t);
    void delete(T t);
    void update(T t);

}