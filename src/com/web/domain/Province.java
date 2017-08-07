package com.web.domain;

/**
 * Created by Taeyeon-Serenity on 2017/7/23.
 */
public class Province {
    public int getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(int provinceid) {
        this.provinceid = provinceid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province(int provinceid, String name) {
        super();
        this.provinceid = provinceid;
        this.name = name;
    }

    public Province() {
        super();
    }

    private int provinceid;
    private String name;
}
