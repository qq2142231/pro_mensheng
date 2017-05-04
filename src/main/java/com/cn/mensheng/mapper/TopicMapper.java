package com.cn.mensheng.mapper;

import com.cn.mensheng.form.module.Topic;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TopicMapper {
    int deleteByPrimaryKey(Integer topic_id);

    int insert(Topic record);

    int insertSelective(Topic record);

    Topic selectByPrimaryKey(Integer topic_id);

    int updateByPrimaryKeySelective(Topic record);

    List<Topic> selectByBoardID(Integer board_id);

    int updateByPrimaryKey(Topic record);
}