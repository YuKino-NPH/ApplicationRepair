package com.Yukino.controller;

import com.Yukino.bean.Msg;
import com.Yukino.bean.RepairPersonnel;
import com.Yukino.service.RepairPersonnelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RepairPersonnelController {
    @Autowired
    RepairPersonnelService repairPersonnelService;

    @ResponseBody
    @RequestMapping(value = "/Repair")
    public Msg getAll(){
        List<RepairPersonnel> list = repairPersonnelService.getAll();
        return Msg.success().add("repairs",list);
    }

}
