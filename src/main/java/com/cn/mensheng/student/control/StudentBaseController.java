package com.cn.mensheng.student.control;

import org.springframework.util.Assert;
import com.cn.mensheng.student.service.module.Student;
import com.cn.mensheng.student.constant.stuconstant;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017-04-30.
 */
public class StudentBaseController  {
    protected static final String ERROR_MSG_KEY = "errorMsg";

    /**
     * 获取保存在Session中的用户对象
     *
     * @param request
     * @return
     */
    protected  Student getSessionStudent(HttpServletRequest request) {
        return (Student) request.getSession().getAttribute(
                stuconstant.STUDENT_CONTEXT);
    }

    /**
     * 保存用户对象到Session中
     *
     * @param request
     * @param student
     */
    protected void setSessionStudent(HttpServletRequest request, Student student) {
        request.getSession().setAttribute(stuconstant.STUDENT_CONTEXT,
                student);
    }


    /**
     * 获取基于应用程序的url绝对路径
     *
     * @param request
     * @param url     以"/"打头的URL地址
     * @return 基于应用程序的url绝对路径
     */
    public final String getAppbaseUrl(HttpServletRequest request, String url) {
        Assert.hasLength(url, "url不能为空");
        Assert.isTrue(url.startsWith("/"), "必须以/打头");
        return request.getContextPath() + url;
    }
}
