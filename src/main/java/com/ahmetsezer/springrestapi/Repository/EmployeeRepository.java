package com.ahmetsezer.springrestapi.Repository;

import com.ahmetsezer.springrestapi.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;

   public List<Employee>getAllEmployeeList(){
        return employeeList; //Sanki burdaki employee listesi veritabanına gitmiş ve employee listesini çekmiş gib düşünün.
    }

    public Employee getEmployeeById(String id){
        Employee findEmployee = null;
       for(Employee employee: employeeList){
           if(id.equals(employee.getId())){
               findEmployee = employee;
               break;
           }
       }
       return findEmployee;
    }
}
