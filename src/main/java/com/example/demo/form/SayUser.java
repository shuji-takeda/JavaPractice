package com.example.demo.form;

import java.beans.JavaBean;

@JavaBean
public class SayUser {

    private String id;
    private String name;
    private String col;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }
}
