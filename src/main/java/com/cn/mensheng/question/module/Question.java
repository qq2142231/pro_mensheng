package com.cn.mensheng.question.module;

import java.io.Serializable;

public class Question implements Serializable {
    private Integer questionId;

    private Integer sectionId;

    private Integer qtypeId;

    private Integer teacherId;

    private String content;

    private Float score;

    private String correctAns;

    private static final long serialVersionUID = 1L;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getQtypeId() {
        return qtypeId;
    }

    public void setQtypeId(Integer qtypeId) {
        this.qtypeId = qtypeId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns == null ? null : correctAns.trim();
    }
}