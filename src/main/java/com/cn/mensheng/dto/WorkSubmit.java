package com.cn.mensheng.dto;

import java.io.Serializable;
import java.util.Date;

public class WorkSubmit extends WorkSubmitKey implements Serializable {
    private String submission;

    private Date subtime;

    private String subfile;

    private Float result;

    private static final long serialVersionUID = 1L;

    public String getSubmission() {
        return submission;
    }

    public void setSubmission(String submission) {
        this.submission = submission == null ? null : submission.trim();
    }

    public Date getSubtime() {
        return subtime;
    }

    public void setSubtime(Date subtime) {
        this.subtime = subtime;
    }

    public String getSubfile() {
        return subfile;
    }

    public void setSubfile(String subfile) {
        this.subfile = subfile == null ? null : subfile.trim();
    }

    public Float getResult() {
        return result;
    }

    public void setResult(Float result) {
        this.result = result;
    }
}