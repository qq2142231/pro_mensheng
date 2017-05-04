package com.cn.mensheng.mapper;

import com.cn.mensheng.dto.FormInformation;
import com.cn.mensheng.dto.FormInformationKey;

public interface FormInformationMapper {
    int deleteByPrimaryKey(FormInformationKey key);

    int insert(FormInformation record);

    int insertSelective(FormInformation record);

    FormInformation selectByPrimaryKey(FormInformationKey key);

    int updateByPrimaryKeySelective(FormInformation record);

    int updateByPrimaryKey(FormInformation record);
}