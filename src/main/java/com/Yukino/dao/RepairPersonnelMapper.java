package com.Yukino.dao;

import com.Yukino.bean.RepairPersonnel;
import com.Yukino.bean.RepairPersonnelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairPersonnelMapper {
    long countByExample(RepairPersonnelExample example);

    int deleteByExample(RepairPersonnelExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(RepairPersonnel record);

    int insertSelective(RepairPersonnel record);

    List<RepairPersonnel> selectByExample(RepairPersonnelExample example);

    RepairPersonnel selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") RepairPersonnel record, @Param("example") RepairPersonnelExample example);

    int updateByExample(@Param("record") RepairPersonnel record, @Param("example") RepairPersonnelExample example);

    int updateByPrimaryKeySelective(RepairPersonnel record);

    int updateByPrimaryKey(RepairPersonnel record);
    //根据姓名查找
    RepairPersonnel selectByName(String name);
}