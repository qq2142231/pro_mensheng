package com.cn.mensheng.videodetail.module;

import java.io.Serializable;
import java.util.Date;

public class VideoDetail extends VideoDetailKey implements Serializable {
    private Date last_watch_time;

    private Integer watch_times;

    private Integer total_time;

    private String last_watch_videotime;

    private static final long serialVersionUID = 1L;

    public Date getLast_watch_time() {
        return last_watch_time;
    }

    public void setLast_watch_time(Date last_watch_time) {
        this.last_watch_time = last_watch_time;
    }

    public Integer getWatch_times() {
        return watch_times;
    }

    public void setWatch_times(Integer watch_times) {
        this.watch_times = watch_times;
    }

    public Integer getTotal_time() {
        return total_time;
    }

    public void setTotal_time(Integer total_time) {
        this.total_time = total_time;
    }

    public String getLast_watch_videotime() {
        return last_watch_videotime;
    }

    public void setLast_watch_videotime(String last_watch_videotime) {
        this.last_watch_videotime = last_watch_videotime == null ? null : last_watch_videotime.trim();
    }
}