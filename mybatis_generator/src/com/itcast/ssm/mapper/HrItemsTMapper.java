package com.itcast.ssm.mapper;

import com.itcast.ssm.po.HrItemsT;
import com.itcast.ssm.po.HrItemsTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HrItemsTMapper {
    int countByExample(HrItemsTExample example);

    int deleteByExample(HrItemsTExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HrItemsT record);

    int insertSelective(HrItemsT record);

    List<HrItemsT> selectByExample(HrItemsTExample example);

    HrItemsT selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HrItemsT record, @Param("example") HrItemsTExample example);

    int updateByExample(@Param("record") HrItemsT record, @Param("example") HrItemsTExample example);

    int updateByPrimaryKeySelective(HrItemsT record);

    int updateByPrimaryKey(HrItemsT record);
}