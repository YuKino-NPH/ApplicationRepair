package com.Yukino.test;

import com.Yukino.bean.MaintenanceSheet;
import com.Yukino.bean.RepairPersonnel;
import com.Yukino.dao.CustomerMapper;
import com.Yukino.service.CustService;
import com.Yukino.service.CustomerService;
import com.Yukino.service.RepairPersonnelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;
import java.util.stream.Stream;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitWebConfig(locations = "classpath:applicationContext.xml")
public class MapperTest {

    @Autowired
    CustService custService;
    @Autowired
    CustomerService customerService;
    @Autowired
    RepairPersonnelService repairPersonnelService;

    @Test
    public void test() {
        Integer i = customerService.saveSheepByID(new MaintenanceSheet(1, "空调损坏"));
        System.out.println(i);
    }

    @Test
    public void test2() {
        customerService.updateSheet(3, "空调漏水");
    }

    @Test
    public void test3() {
        List<MaintenanceSheet> list = custService.getAllSheets();
        System.out.println(list);
    }

    @Test
    public void test4() {
        List<RepairPersonnel> all = repairPersonnelService.getAll();
        System.out.println(all);
    }

    @Test
    public void test5() {
        Integer hamilton = custService.updateRepair(4, 1, "Hamilton");
    }

    @Test
    public void test6() {
        int[][] buildings={{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
        System.out.println(getSkyline(buildings));
    }

    public List<List<Integer>> getSkyline(int[][] buildings) {
        Arrays.sort(buildings, (o1, o2) -> {
            if (o1[0] == o2[0])
                return o1[1] - o2[1];
            return o1[0] - o2[0];
        });
        int[] arr = {1,2,35};
        Arrays.sort(arr);
        Set<Integer> highSet=new HashSet<>();
        int index=0;
        int max=0;
        List<List<Integer>> list=new ArrayList<>();
        while (index<buildings.length){
            highSet.clear();
            max=buildings[index][1];
            while (index< buildings.length&&buildings[index][0]<=max){
                if (!highSet.contains(buildings[index][2])){
                    highSet.add(buildings[index][2]);
                    List<Integer> list1=new ArrayList<>();
                    if (list.get(list.size()-1).get(1)> buildings[index][2]&&highSet.size()!=0){

                    }
                    list1.add(buildings[index][0]);
                    list1.add(buildings[index][2]);
                    list.add(list1);
                }
                max=Math.max(max,buildings[index][1]);
                index++;
            }
        }
        return list;
    }
    @Test
    public void test7(){
        Stack
        int[] nums={5,7,7,8,8,10};
        int search = search(nums, 8);
        System.out.println(search);
    }
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int mid=0;
        int count=1;
        while(l<r){
            mid=l+(r-l)/2;
            if(nums[mid]==target){
                break;
            }
            if(nums[mid]>target){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        if(nums[mid]!=target)
            return 0;
        l=mid-1;
        r=mid+1;
        while(l>=0&nums[l]==target){
            count++;
            l--;
        }
        while(r<nums.length&&nums[r]==target){
            count++;
            r++;
        }
        return count;
    }

}
