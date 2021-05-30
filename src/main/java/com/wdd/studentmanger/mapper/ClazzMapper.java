package com.wdd.studentmanger.mapper;

import com.wdd.studentmanger.domain.Clazz;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Classname ClazzMapper
 * @Description None
 * @Date 2019/6/24 20:09
 * @Created by WDD
 */
@Mapper
public interface ClazzMapper {
    List<Clazz> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addClazz(Clazz clazz);

    int deleteClazz(List<Integer> ids);

    int editClazz(Clazz clazz);

    Clazz findByName(String clazzName);
}
