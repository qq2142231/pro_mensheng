package com.cn.mensheng.student.service.module;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private Integer stuId;

    private String nickname;

    private String telephone;

    private String email;

    private String picture;

    private String certified_identity;

    private String identity;

    private String realname;

    private String lastdegree;

    private String address;

    private String gender;

    private String profession;

    private Date birthday;

    private String description;

    private Integer numbering;

    private Integer money;

    private Boolean isOpen;

    private Integer course_num;

    private Boolean isAssistant;

    private Boolean isSquadleader;

    private Float overall_result;

    private String study_situation;

    private Boolean hasCertificate;

    private String password;

    private static final long serialVersionUID = 1L;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getCertified_identity() {
        return certified_identity;
    }

    public void setCertified_identity(String certified_identity) {
        this.certified_identity = certified_identity == null ? null : certified_identity.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getLastdegree() {
        return lastdegree;
    }

    public void setLastdegree(String lastdegree) {
        this.lastdegree = lastdegree == null ? null : lastdegree.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getNumbering() {
        return numbering;
    }

    public void setNumbering(Integer numbering) {
        this.numbering = numbering;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Integer getCourse_num() {
        return course_num;
    }

    public void setCourse_num(Integer course_num) {
        this.course_num = course_num;
    }

    public Boolean getIsAssistant() {
        return isAssistant;
    }

    public void setIsAssistant(Boolean isAssistant) {
        this.isAssistant = isAssistant;
    }

    public Boolean getIsSquadleader() {
        return isSquadleader;
    }

    public void setIsSquadleader(Boolean isSquadleader) {
        this.isSquadleader = isSquadleader;
    }

    public Float getOverall_result() {
        return overall_result;
    }

    public void setOverall_result(Float overall_result) {
        this.overall_result = overall_result;
    }

    public String getStudy_situation() {
        return study_situation;
    }

    public void setStudy_situation(String study_situation) {
        this.study_situation = study_situation == null ? null : study_situation.trim();
    }

    public Boolean getHasCertificate() {
        return hasCertificate;
    }

    public void setHasCertificate(Boolean hasCertificate) {
        this.hasCertificate = hasCertificate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}