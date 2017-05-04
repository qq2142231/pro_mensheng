package com.cn.mensheng.homework.controller;

import com.cn.mensheng.dto.WorkSubmit;
import com.cn.mensheng.homework.module.Homework;
import com.cn.mensheng.homework.service.HomeworkService;
import com.cn.mensheng.course.constant.constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * Created by Leafqun on 2017/4/28.
 */
@Controller
public class HomeworkController {
    @Autowired
    private HomeworkService homeworkService;
    //获取每章的所有作业
    @RequestMapping(value="/homework")
    public String getHomeworks(Model model, Integer chapterId) throws Exception {
        if(chapterId!=null){
            List<Homework> homeworkList=homeworkService.selectHomeworksByChapterId(chapterId);
            model.addAttribute("homeworkList",homeworkList);
        }
        return "";
    }
    //提交每一章的作业
    @RequestMapping(value="/submitHomework")
    public String submitHomework(Model model, List<WorkSubmit> workSubmitList, HttpSession session,MultipartFile cfile) throws Exception {
        if(workSubmitList==null){
            return "";
        }
        for(WorkSubmit workSubmit:workSubmitList) {
            if (workSubmit == null||session == null) {continue;}

            Integer stuId = (Integer) session.getAttribute("stuId");
            workSubmit.setStuId(stuId);
            //上传时间
            workSubmit.setSubtime(new Date());
            //上传文件时
            if (cfile != null) {
                String filename = cfile.getOriginalFilename();
                // 存储图片的物理路径
                if (filename != null && !filename.trim().equals("")) {
                    //新文件
                    File newfile = new File(constant.FILE_PATH + filename);
                    //删除旧文件
                    if (workSubmit.getSubfile() != null && !workSubmit.getSubfile().trim().equals("")) {
                        File originalfile = new File(constant.FILE_PATH + workSubmit.getSubfile());
                        originalfile.delete();
                    }
                    cfile.transferTo(newfile);
                    workSubmit.setSubfile(filename);
                }
            }
           // homeworkService.insertWorkSubmit(workSubmit);
        }
        return "";
    }
}
