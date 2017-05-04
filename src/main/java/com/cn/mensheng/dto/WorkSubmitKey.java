package com.cn.mensheng.dto;

import java.io.Serializable;

public class WorkSubmitKey implements Serializable {
    private Integer homeworkId;

    private Integer stuId;

    private static final long serialVersionUID = 1L;

    public Integer getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(Integer homeworkId) {
        this.homeworkId = homeworkId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }
}