package com.master.dearmaster.model;

import javax.persistence.*;

@Entity
@Table(name = "dearmaster_blog_category_tbl", uniqueConstraints = { @UniqueConstraint(columnNames = { "name"})})
public class BlogCategory {

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "name")
    private String name;

    public BlogCategory() {

    }

    public BlogCategory(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}