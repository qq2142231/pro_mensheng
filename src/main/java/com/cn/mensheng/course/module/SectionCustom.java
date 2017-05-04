package com.cn.mensheng.course.module;

import com.cn.mensheng.videodetail.module.VideoDetail;

import java.util.List;

public class SectionCustom extends Section {
    private List<VideoDetail> videoDetailList;

    public List<VideoDetail> getVideoDetailList() {
        return videoDetailList;
    }

    public void setVideoDetailList(List<VideoDetail> videoDetailList) {
        this.videoDetailList = videoDetailList;
    }
}