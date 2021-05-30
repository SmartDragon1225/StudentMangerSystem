package com.wdd.studentmanger.service;

import com.wdd.studentmanger.domain.SelectedCourse;
import com.wdd.studentmanger.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @Classname SelectedCourseService
 * @Description None
 * @Date 2019/6/30 10:48
 * @Created by WDD
 */
public interface SelectedCourseService {
    PageBean<SelectedCourse> queryPage(Map<String, Object> paramMap);

    int addSelectedCourse(SelectedCourse selectedCourse);

    int deleteSelectedCourse(Integer id);

    boolean isStudentId(int id);

    List<SelectedCourse> getAllBySid(int studentid);
}
