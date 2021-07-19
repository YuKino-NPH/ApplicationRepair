package com.Yukino.controller;

import com.Yukino.bean.MaintenanceSheet;
import com.Yukino.bean.Msg;
import com.Yukino.service.CustomerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    //查询该客户所有的维修订单  首页
    @ResponseBody
    @RequestMapping(value = "/CustSheeps",method = RequestMethod.GET)
    public Msg getAllSheet(@RequestParam(value = "cId") Integer cId,@RequestParam(value="pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,5);
        List<MaintenanceSheet> list = customerService.getAllByID(cId);
        PageInfo pageInfo=new PageInfo(list);
        return Msg.success().add("pageInfo",pageInfo);
    }
    //新增维修订单
    @ResponseBody
    @RequestMapping(value="/CustSheep" ,method = RequestMethod.POST)
    public Msg saveSheet(MaintenanceSheet maintenanceSheet){
        customerService.saveSheepByID(maintenanceSheet);
        return Msg.success();
    }

    //修改维修订单
    @ResponseBody
    @RequestMapping(value = "/CustSheep/{mId}",method = RequestMethod.PUT)
    public Msg updateSheet(@PathVariable Integer mId,@RequestParam(value = "rContext") String rContext){
        customerService.updateSheet(mId,rContext);
        return Msg.success();
    }

    //删除订单
    @ResponseBody
    @RequestMapping(value = "/Custsheep/{mIds}",method = RequestMethod.DELETE)
    public Msg deleteSheet(@PathVariable String mIds){

        if(mIds.contains("-")){
//            批量删除
            List<Integer> del_ids = new ArrayList<>();
//            按照-分隔开，转化为String数组
            String[] str_ids = mIds.split("-");
//            组装id的集合
            for(String s : str_ids){
                customerService.deleteSheet(Integer.parseInt(s));
            }
        }else{
//            单个删除
            Integer id = Integer.parseInt(mIds);
            customerService.deleteSheet(id);
        }
        return Msg.success();
    }
}
