package com.wdd.studentmanger.service;

import com.wdd.studentmanger.domain.Clazz;
import com.wdd.studentmanger.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @Classname ClazzService
 * @Description None
 * @Date 2019/6/26 10:14
 * @Created by WDD
 */
public interface ClazzService {
    PageBean<Clazz> queryPage(Map<String, Object> paramMap);

    int addClazz(Clazz clazz);

    int deleteClazz(List<Integer> ids);

    int editClazz(Clazz clazz);

    Clazz findByName(String clazzName);

}
