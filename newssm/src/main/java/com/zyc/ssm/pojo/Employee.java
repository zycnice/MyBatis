package com.zyc.ssm.pojo;

import lombok.Data;

/**
 * @author zyc
 * @version 1.0
 */
@Data
public class Employee {
    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;
    private String email;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
