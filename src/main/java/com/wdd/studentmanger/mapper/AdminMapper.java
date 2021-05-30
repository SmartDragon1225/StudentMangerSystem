package com.wdd.studentmanger.mapper;

import com.wdd.studentmanger.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Classname UserMapper
 * @Description None
 * @Date 2019/6/24 20:09
 * @Created by WDD
 */
@Mapper
public interface AdminMapper {

    Admin findByAdmin(Admin admin);


    int editPswdByAdmin(Admin admin);
}
