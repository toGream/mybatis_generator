package com.itcast.ssm.mapper;

import com.itcast.ssm.po.HrOrdersT;
import com.itcast.ssm.po.HrOrdersTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HrOrdersTMapper {
    int countByExample(HrOrdersTExample example);

    int deleteByExample(HrOrdersTExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HrOrdersT record);

    int insertSelective(HrOrdersT record);

    List<HrOrdersT> selectByExample(HrOrdersTExample example);

    HrOrdersT selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HrOrdersT record, @Param("example") HrOrdersTExample example);

    int updateByExample(@Param("record") HrOrdersT record, @Param("example") HrOrdersTExample example);

    int updateByPrimaryKeySelective(HrOrdersT record);

    int updateByPrimaryKey(HrOrdersT record);
}