package com.cn.mensheng.form.module;

import java.io.Serializable;

public class BoardManagerKey implements Serializable {
    private Integer board_id;

    private Integer user_id;

    private static final long serialVersionUID = 1L;

    public Integer getBoard_id() {
        return board_id;
    }

    public void setBoard_id(Integer board_id) {
        this.board_id = board_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}