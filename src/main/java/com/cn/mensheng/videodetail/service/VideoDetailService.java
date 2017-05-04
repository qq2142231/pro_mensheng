package com.cn.mensheng.videodetail.service;

import com.cn.mensheng.videodetail.module.VideoDetail;
import com.cn.mensheng.videodetail.module.VideoDetailKey;

/**
 * Created by Leafqun on 2017/5/2.
 */
public interface VideoDetailService {
    //获取视频的信息
    public VideoDetail selectVideoByPrimaryKey(VideoDetailKey key) throws Exception;
}
