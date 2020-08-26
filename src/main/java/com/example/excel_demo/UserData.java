package com.example.excel_demo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class UserData {
    @ExcelProperty("用户名")
    private String username;
    @ExcelProperty("密码")
    private String password;
}
