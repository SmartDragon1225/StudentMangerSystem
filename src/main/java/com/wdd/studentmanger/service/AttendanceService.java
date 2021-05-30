package com.wdd.studentmanger.service;

import com.wdd.studentmanger.domain.Attendance;
import com.wdd.studentmanger.util.PageBean;

import java.util.Map;

/**
 * @Classname AttendanceService
 * @Description None
 * @Date 2019/7/1 15:47
 * @Created by WDD
 */
public interface AttendanceService {
    PageBean<Attendance> queryPage(Map<String, Object> paramMap);

    boolean isAttendance(Attendance attendance);

    int addAtendance(Attendance attendance);

    int deleteAttendance(Integer id);
}
