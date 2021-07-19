package com.Yukino.service;

import com.Yukino.bean.RepairPersonnel;
import com.Yukino.dao.RepairPersonnelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairPersonnelService {
    @Autowired
    RepairPersonnelMapper repairPersonnelMapper;

    //找到所有维修人员
    public List<RepairPersonnel> getAll(){
        return repairPersonnelMapper.selectByExample(null);
    }

}
