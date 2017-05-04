package com.cn.mensheng.dto;

import java.io.Serializable;

public class CourseNoticeStudentKey implements Serializable {
    private Integer noticeId;

    private Integer stuId;

    private static final long serialVersionUID = 1L;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }
}