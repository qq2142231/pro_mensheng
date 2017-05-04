package com.cn.mensheng.course.module;

import com.cn.mensheng.homework.module.HomeworkCustom;

import java.util.List;

public class ChapterCustom extends Chapter {
    private List<SectionCustom> sectionList;

    private List<HomeworkCustom> homeworkList;

    public List<HomeworkCustom> getHomeworkList() {
        return homeworkList;
    }

    public void setHomeworkList(List<HomeworkCustom> homeworkList) {
        this.homeworkList = homeworkList;
    }

    public List<SectionCustom> getSectionList() {
        return sectionList;
    }

    public void setSectionList(List<SectionCustom> sectionList) {
        this.sectionList = sectionList;
    }
}