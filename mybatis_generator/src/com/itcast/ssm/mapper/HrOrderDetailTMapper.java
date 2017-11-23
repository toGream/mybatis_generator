package com.itcast.ssm.mapper;

import com.itcast.ssm.po.HrOrderDetailT;
import com.itcast.ssm.po.HrOrderDetailTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HrOrderDetailTMapper {
    int countByExample(HrOrderDetailTExample example);

    int deleteByExample(HrOrderDetailTExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HrOrderDetailT record);

    int insertSelective(HrOrderDetailT record);

    List<HrOrderDetailT> selectByExample(HrOrderDetailTExample example);

    HrOrderDetailT selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HrOrderDetailT record, @Param("example") HrOrderDetailTExample example);

    int updateByExample(@Param("record") HrOrderDetailT record, @Param("example") HrOrderDetailTExample example);

    int updateByPrimaryKeySelective(HrOrderDetailT record);

    int updateByPrimaryKey(HrOrderDetailT record);
}