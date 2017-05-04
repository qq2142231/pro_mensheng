package com.cn.mensheng.question.module;

import java.io.Serializable;

public class QuestionType implements Serializable {
    private Integer qtypeId;

    private String qtypeName;

    private static final long serialVersionUID = 1L;

    public Integer getQtypeId() {
        return qtypeId;
    }

    public void setQtypeId(Integer qtypeId) {
        this.qtypeId = qtypeId;
    }

    public String getQtypeName() {
        return qtypeName;
    }

    public void setQtypeName(String qtypeName) {
        this.qtypeName = qtypeName == null ? null : qtypeName.trim();
    }
}