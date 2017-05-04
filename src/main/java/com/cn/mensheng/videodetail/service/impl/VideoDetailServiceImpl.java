package com.cn.mensheng.videodetail.service.impl;

import com.cn.mensheng.mapper.VideoDetailMapper;
import com.cn.mensheng.videodetail.module.VideoDetail;
import com.cn.mensheng.videodetail.module.VideoDetailKey;
import com.cn.mensheng.videodetail.service.VideoDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Leafqun on 2017/5/2.
 */
@Service("videoDetailService")
public class VideoDetailServiceImpl implements VideoDetailService{
    @Autowired
    private VideoDetailMapper videoDetailMapper;
    @Override
    public VideoDetail selectVideoByPrimaryKey(VideoDetailKey key) throws Exception {
        return videoDetailMapper.selectByPrimaryKey(key);
    }
}
