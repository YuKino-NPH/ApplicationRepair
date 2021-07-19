package com.Yukino.service;

import com.Yukino.bean.MaintenanceSheet;
import com.Yukino.bean.MaintenanceSheetExample;
import com.Yukino.dao.CustomerMapper;
import com.Yukino.dao.MaintenanceSheetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    @Autowired
    MaintenanceSheetMapper maintenanceSheetMapper;

    //查询属于自己的所有的维修请求
    public List<MaintenanceSheet> getAllByID(Integer id){
        return maintenanceSheetMapper.selectBycId(id);
    }

    //保存新的维修订单
    public Integer saveSheepByID(MaintenanceSheet maintenanceSheet ){
        return maintenanceSheetMapper.insertSelective(maintenanceSheet);
    }

    //修改订单
    public Integer updateSheet(Integer mid, String rContext) {
        return maintenanceSheetMapper.updateByPrimaryKeySelective(new MaintenanceSheet(mid,rContext));
    }

    //删除订单
    public void deleteSheet(Integer mId) {
        maintenanceSheetMapper.deleteByPrimaryKey(mId);
    }

}
