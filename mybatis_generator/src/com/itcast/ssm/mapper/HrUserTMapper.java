package com.itcast.ssm.mapper;

import com.itcast.ssm.po.HrUserT;
import com.itcast.ssm.po.HrUserTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HrUserTMapper {
    int countByExample(HrUserTExample example);

    int deleteByExample(HrUserTExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HrUserT record);

    int insertSelective(HrUserT record);

    List<HrUserT> selectByExample(HrUserTExample example);

    HrUserT selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HrUserT record, @Param("example") HrUserTExample example);

    int updateByExample(@Param("record") HrUserT record, @Param("example") HrUserTExample example);

    int updateByPrimaryKeySelective(HrUserT record);

    int updateByPrimaryKey(HrUserT record);
}