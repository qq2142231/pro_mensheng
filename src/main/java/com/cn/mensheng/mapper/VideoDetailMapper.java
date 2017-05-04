package com.cn.mensheng.mapper;

import com.cn.mensheng.videodetail.module.VideoDetail;
import com.cn.mensheng.videodetail.module.VideoDetailKey;

public interface VideoDetailMapper {
    int deleteByPrimaryKey(VideoDetailKey key);

    int insert(VideoDetail record);

    int insertSelective(VideoDetail record);

    VideoDetail selectByPrimaryKey(VideoDetailKey key);

    int updateByPrimaryKeySelective(VideoDetail record);

    int updateByPrimaryKey(VideoDetail record);
}