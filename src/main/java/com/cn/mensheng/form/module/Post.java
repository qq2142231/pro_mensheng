package com.cn.mensheng.form.module;

import java.io.Serializable;
import java.util.Date;

public class Post implements Serializable {
    private Integer post_id;

    private Integer board_id;

    private Integer topic_id;

    private Integer user_id;

    private Byte post_type;

    private String post_title;

    private Date create_time;

    private String post_text;

    private static final long serialVersionUID = 1L;

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public Integer getBoard_id() {
        return board_id;
    }

    public void setBoard_id(Integer board_id) {
        this.board_id = board_id;
    }

    public Integer getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Integer topic_id) {
        this.topic_id = topic_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Byte getPost_type() {
        return post_type;
    }

    public void setPost_type(Byte post_type) {
        this.post_type = post_type;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title == null ? null : post_title.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getPost_text() {
        return post_text;
    }

    public void setPost_text(String post_text) {
        this.post_text = post_text == null ? null : post_text.trim();
    }
}