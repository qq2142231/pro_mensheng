package com.cn.mensheng.note.module;

import java.io.Serializable;
import java.util.Date;

public class NoteComment extends NoteCommentKey implements Serializable {
    private String content;

    private Date commentTime;

    private Integer like_num;

    private static final long serialVersionUID = 1L;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getLike_num() {
        return like_num;
    }

    public void setLike_num(Integer like_num) {
        this.like_num = like_num;
    }
}