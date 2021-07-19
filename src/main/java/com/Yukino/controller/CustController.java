package com.Yukino.controller;

import com.Yukino.bean.CustomerService;
import com.Yukino.bean.MaintenanceSheet;
import com.Yukino.bean.Msg;
import com.Yukino.service.CustService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//客服前端控制器
@Controller
public class CustController {
    @Autowired
    CustService custService;
    @ResponseBody
    @RequestMapping(value = "/Sheets",method = RequestMethod.GET)
    public Msg getAllSheets(@RequestParam(value = "pn",defaultValue = "1") Integer pn){

        PageHelper.startPage(pn,5);
        List<MaintenanceSheet> list = custService.getAllSheets();
        PageInfo pageInfo=new PageInfo(list);

        System.out.println(pageInfo.getList().size());
        return Msg.success().add("pageInfo",pageInfo);
    }

    @ResponseBody
    @RequestMapping(value = "/CustService",method = RequestMethod.GET)
    public Msg getAllCustService(){
        List<CustomerService> all = custService.getAll();
        return Msg.success().add("services",all);
    }
    @ResponseBody
    @RequestMapping(value="/CustService/{mId}",method = RequestMethod.PUT)
    public Msg updateSheet(@PathVariable Integer mId,@RequestParam(value = "rName")String rName){
        System.out.println(rName);
        custService.updateRepair(mId,1,rName);
        return Msg.success();
    }

    @ResponseBody
    @RequestMapping(value = "/CustService/{mIds}",method = RequestMethod.DELETE)
    public Msg deleteSheet(@PathVariable String mIds){

        if(mIds.contains("-")){
//            批量删除
            List<Integer> del_ids = new ArrayList<>();
//            按照-分隔开，转化为String数组
            String[] str_ids = mIds.split("-");
//            组装id的集合
            for(String s : str_ids){
                custService.deleteSheet(Integer.parseInt(s));
            }
        }else{
//            单个删除
            Integer id = Integer.parseInt(mIds);
            custService.deleteSheet(id);
        }
        return Msg.success();
    }
}
