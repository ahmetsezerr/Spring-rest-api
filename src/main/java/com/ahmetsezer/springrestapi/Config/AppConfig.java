package com.ahmetsezer.springrestapi.Config;

import com.ahmetsezer.springrestapi.Model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","Ahmet","Sezer"));
        employeeList.add(new Employee("2","Esra","Sezer"));

        employeeList.add(new Employee("3","Nazım","Sezer"));

        employeeList.add(new Employee("4","kamil","Sezer"));
        employeeList.add(new Employee("5","yunus","Sezer"));




        return employeeList;
    }
}
