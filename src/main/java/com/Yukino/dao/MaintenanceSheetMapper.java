package com.Yukino.dao;

import com.Yukino.bean.MaintenanceSheet;
import com.Yukino.bean.MaintenanceSheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintenanceSheetMapper {
    long countByExample(MaintenanceSheetExample example);

    int deleteByExample(MaintenanceSheetExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(MaintenanceSheet record);

    int insertSelective(MaintenanceSheet record);

    List<MaintenanceSheet> selectByExample(MaintenanceSheetExample example);

    MaintenanceSheet selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") MaintenanceSheet record, @Param("example") MaintenanceSheetExample example);

    int updateByExample(@Param("record") MaintenanceSheet record, @Param("example") MaintenanceSheetExample example);

    int updateByPrimaryKeySelective(MaintenanceSheet record);

    int updateByPrimaryKey(MaintenanceSheet record);

    //查询含Customer的结果
    List<MaintenanceSheet> selectBycId(Integer cId);

    int updateByKey(@Param("record")MaintenanceSheet record);

    //查询含CustomerService的结果
    List<MaintenanceSheet> selectAllWithService();

}