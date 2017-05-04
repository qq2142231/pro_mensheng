package com.cn.mensheng.course.module;

import java.io.Serializable;

public class Course implements Serializable {
    private Integer courseId;

    private Integer teacherId;

    private Integer ctypeId;

    private String courseName;

    private String description;

    private String courseware;

    private String picture;

    private String hour;

    private Integer stu_num;

    private String ass_criteria;

    private String courseReference;

    private String certificate_info;

    private String intro_video;

    private Integer evaluation;

    private static final long serialVersionUID = 1L;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCtypeId() {
        return ctypeId;
    }

    public void setCtypeId(Integer ctypeId) {
        this.ctypeId = ctypeId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCourseware() {
        return courseware;
    }

    public void setCourseware(String courseware) {
        this.courseware = courseware == null ? null : courseware.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }

    public Integer getStu_num() {
        return stu_num;
    }

    public void setStu_num(Integer stu_num) {
        this.stu_num = stu_num;
    }

    public String getAss_criteria() {
        return ass_criteria;
    }

    public void setAss_criteria(String ass_criteria) {
        this.ass_criteria = ass_criteria == null ? null : ass_criteria.trim();
    }

    public String getCourseReference() {
        return courseReference;
    }

    public void setCourseReference(String courseReference) {
        this.courseReference = courseReference == null ? null : courseReference.trim();
    }

    public String getCertificate_info() {
        return certificate_info;
    }

    public void setCertificate_info(String certificate_info) {
        this.certificate_info = certificate_info == null ? null : certificate_info.trim();
    }

    public String getIntro_video() {
        return intro_video;
    }

    public void setIntro_video(String intro_video) {
        this.intro_video = intro_video == null ? null : intro_video.trim();
    }

    public Integer getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Integer evaluation) {
        this.evaluation = evaluation;
    }
}