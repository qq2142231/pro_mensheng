package com.cn.mensheng.videodetail.module;

import java.io.Serializable;

public class VideoDetailKey implements Serializable {
    private Integer sectionId;

    private Integer stuId;

    private static final long serialVersionUID = 1L;

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }
}