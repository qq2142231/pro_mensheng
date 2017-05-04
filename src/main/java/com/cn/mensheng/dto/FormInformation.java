package com.cn.mensheng.dto;

import java.io.Serializable;
import java.util.Date;

public class FormInformation extends FormInformationKey implements Serializable {
    private String content;

    private Date formTime;

    private String identity;

    private String area;

    private Integer like_num;

    private static final long serialVersionUID = 1L;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getFormTime() {
        return formTime;
    }

    public void setFormTime(Date formTime) {
        this.formTime = formTime;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Integer getLike_num() {
        return like_num;
    }

    public void setLike_num(Integer like_num) {
        this.like_num = like_num;
    }
}