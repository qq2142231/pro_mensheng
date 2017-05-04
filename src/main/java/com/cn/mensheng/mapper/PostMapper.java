package com.cn.mensheng.mapper;

import com.cn.mensheng.form.module.Post;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PostMapper {
    int deleteByPrimaryKey(Integer post_id);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer post_id);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKeyWithBLOBs(Post record);

    List<Post> selectByTopicID(Integer topic_id);

    List<Post> selectByTextTitle(String post_title);

    int updateByPrimaryKey(Post record);
}