package com.cn.mensheng.mapper;

import com.cn.mensheng.homework.module.HomeworkCustom;

import java.util.List;

/**
 * Created by Leafqun on 2017/4/28.
 */
public interface HomeworkCustomMapper {
    List<HomeworkCustom> selectHomeworksByChapterId(Integer chapterId);

}
