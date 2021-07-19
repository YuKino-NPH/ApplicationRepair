package com.Yukino.service;

import com.Yukino.bean.CustomerService;
import com.Yukino.bean.MaintenanceSheet;
import com.Yukino.bean.RepairPersonnel;
import com.Yukino.dao.CustomerServiceMapper;
import com.Yukino.dao.MaintenanceSheetMapper;
import com.Yukino.dao.RepairPersonnelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//客服
@Service
public class CustService {
    @Autowired
    CustomerServiceMapper customerServiceMapper;
    @Autowired
    MaintenanceSheetMapper maintenanceSheetMapper;
    @Autowired
    RepairPersonnelMapper repairPersonnelMapper;

    //获取所有的维修单
    public List<MaintenanceSheet> getAllSheets() {
        return maintenanceSheetMapper.selectAllWithService();
    }

    //查询所有维修人员
    public List<CustomerService> getAll() {
        return customerServiceMapper.selectByExample(null);
    }

    //给维修单派发维修人员
    public Integer updateRepair(Integer mId,Integer sId,String rName){
        RepairPersonnel repairPersonnel = repairPersonnelMapper.selectByName(rName);
        return maintenanceSheetMapper.updateByPrimaryKeySelective(new MaintenanceSheet(mId,sId,repairPersonnel.getrId()));
    }
    //删除
    public void deleteSheet(int parseInt) {
        customerServiceMapper.deleteByPrimaryKey(parseInt);
    }
}
