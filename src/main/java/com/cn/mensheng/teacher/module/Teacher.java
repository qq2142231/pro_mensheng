package com.cn.mensheng.teacher.module;

import java.io.Serializable;

public class Teacher implements Serializable {
    private Integer teacherId;

    private String teacherName;

    private String profession;

    private String description;

    private String affi_units;

    private String job_title;

    private String photo;

    private Integer focus_num;

    private String password;

    private static final long serialVersionUID = 1L;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAffi_units() {
        return affi_units;
    }

    public void setAffi_units(String affi_units) {
        this.affi_units = affi_units == null ? null : affi_units.trim();
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title == null ? null : job_title.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getFocus_num() {
        return focus_num;
    }

    public void setFocus_num(Integer focus_num) {
        this.focus_num = focus_num;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}