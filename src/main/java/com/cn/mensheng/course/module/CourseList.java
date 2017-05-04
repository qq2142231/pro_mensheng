package com.cn.mensheng.course.module;

import java.io.Serializable;
import java.util.Date;

public class CourseList extends CourseListKey implements Serializable {
    private Date createtime;

    private Date studytime;

    private Integer progress;

    private String evaluate;

    private String eva_content;

    private Date eva_time;

    private static final long serialVersionUID = 1L;

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getStudytime() {
        return studytime;
    }

    public void setStudytime(Date studytime) {
        this.studytime = studytime;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate == null ? null : evaluate.trim();
    }

    public String getEva_content() {
        return eva_content;
    }

    public void setEva_content(String eva_content) {
        this.eva_content = eva_content == null ? null : eva_content.trim();
    }

    public Date getEva_time() {
        return eva_time;
    }

    public void setEva_time(Date eva_time) {
        this.eva_time = eva_time;
    }
}