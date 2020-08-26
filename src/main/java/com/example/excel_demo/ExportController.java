package com.example.excel_demo;

import com.alibaba.excel.EasyExcel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExportController {
    @GetMapping("/export")
    public void export() {
        String fileName = "User.xlsx";
        List<UserData> lists = new ArrayList<>();
        UserData data = new UserData();
        data.setUsername("wang");
        data.setPassword("150361");
        lists.add(data);
        UserData data2 = new UserData();
        data2.setUsername("xiao");
        data2.setPassword("111111");
        lists.add(data2);
        EasyExcel.write(fileName, UserData.class).sheet("模板").doWrite(lists);
    }

    @GetMapping("/demo")
    public String demo(){
        return "hello demo";
    }
}
