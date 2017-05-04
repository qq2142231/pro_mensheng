package com.cn.mensheng.form.module;

import java.io.Serializable;
import java.util.Date;

public class Topic implements Serializable {
    private Integer topic_id;

    private Integer board_id;

    private String topic_title;

    private Integer user_id;

    private Date create_time;

    private Date last_post;

    private Integer topic_views;

    private Integer topic_replies;

    private Integer digest;

    private static final long serialVersionUID = 1L;

    public Integer getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Integer topic_id) {
        this.topic_id = topic_id;
    }

    public Integer getBoard_id() {
        return board_id;
    }

    public void setBoard_id(Integer board_id) {
        this.board_id = board_id;
    }

    public String getTopic_title() {
        return topic_title;
    }

    public void setTopic_title(String topic_title) {
        this.topic_title = topic_title == null ? null : topic_title.trim();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getLast_post() {
        return last_post;
    }

    public void setLast_post(Date last_post) {
        this.last_post = last_post;
    }

    public Integer getTopic_views() {
        return topic_views;
    }

    public void setTopic_views(Integer topic_views) {
        this.topic_views = topic_views;
    }

    public Integer getTopic_replies() {
        return topic_replies;
    }

    public void setTopic_replies(Integer topic_replies) {
        this.topic_replies = topic_replies;
    }

    public Integer getDigest() {
        return digest;
    }

    public void setDigest(Integer digest) {
        this.digest = digest;
    }
}