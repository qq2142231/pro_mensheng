package com.cn.mensheng.form.module;

import java.io.Serializable;

public class Board implements Serializable {
    private Integer board_id;

    private String board_name;

    private String board_desc;

    private Integer topic_num;

    private static final long serialVersionUID = 1L;

    public Integer getBoard_id() {
        return board_id;
    }

    public void setBoard_id(Integer board_id) {
        this.board_id = board_id;
    }

    public String getBoard_name() {
        return board_name;
    }

    public void setBoard_name(String board_name) {
        this.board_name = board_name == null ? null : board_name.trim();
    }

    public String getBoard_desc() {
        return board_desc;
    }

    public void setBoard_desc(String board_desc) {
        this.board_desc = board_desc == null ? null : board_desc.trim();
    }

    public Integer getTopic_num() {
        return topic_num;
    }

    public void setTopic_num(Integer topic_num) {
        this.topic_num = topic_num;
    }
}