package com.cn.mensheng.dto;

import java.io.Serializable;

public class FocusListKey implements Serializable {
    private Integer teacherId;

    private Integer stuId;

    private static final long serialVersionUID = 1L;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }
}