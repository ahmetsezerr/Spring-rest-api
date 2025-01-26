package com.ahmetsezer.springrestapi.Controller;


import com.ahmetsezer.springrestapi.Model.Employee;
import com.ahmetsezer.springrestapi.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "rest/api/employee") //bir siteye giderken oraya giderkenki kök adresim burası
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService; // controler katmanından benim service katmanına ulaşmam lazım.IOC containerda olan beanimi(service ile ilgili)olanı autowired ile enjekte edecem



    @GetMapping(path = "/employee-list")
    public List<Employee> getAllEmployees(){ // bütün employee listesini getir.
        //employeeService.getAllEmployeeList();//Controller Sen bu isteği aldın ve bu isteği service e yönlendir
        //employeeservice adındaki getEmployeeList adındaki fonksiyona git diyorum.


        return employeeService.getAllEmployeeList();
    }
    @GetMapping(path ="employee-list/{id}")
    public Employee getEmployeeById(@PathVariable (name = "id", required = true) String id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping(path = "employee-list-with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName")String firstName, @RequestParam(name = "lastName")String lastName) {
        System.out.println(firstName + " " + lastName);
        return null;
    }
}
