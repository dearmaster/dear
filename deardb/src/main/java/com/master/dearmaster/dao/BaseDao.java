package com.master.dearmaster.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao {

    <T> List<T> findAll();
    <T> Serializable save(T t);
    <T> void delete(T t);
    <T> void update(T t);

}