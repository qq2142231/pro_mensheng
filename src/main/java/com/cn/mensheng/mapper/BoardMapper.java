package com.cn.mensheng.mapper;

import com.cn.mensheng.form.module.Board;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BoardMapper {
    int deleteByPrimaryKey(Integer board_id);

    int insert(Board record);

    int insertSelective(Board record);

    Board selectByPrimaryKey(Integer board_id);

    int updateByPrimaryKeySelective(Board record);

    List<Board> allBoard();

    int updateByPrimaryKey(Board record);
}