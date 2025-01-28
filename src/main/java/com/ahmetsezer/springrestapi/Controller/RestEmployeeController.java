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



    @GetMapping(path = "/list")
    public List<Employee> getAllEmployees(){ // bütün employee listesini getir.
        //employeeService.getAllEmployeeList();//Controller Sen bu isteği aldın ve bu isteği service e yönlendir
        //employeeservice adındaki getEmployeeList adındaki fonksiyona git diyorum.


        return employeeService.getAllEmployeeList();
    }
    @GetMapping(path ="list/{id}")
    public Employee getEmployeeById(@PathVariable (name = "id", required = true) String id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping(path = "/with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName",required = false)String firstName, @RequestParam(name = "lastName",required = false)String lastName) {
        return employeeService.getEmployeeWithParams(firstName, lastName);
    }


    @PostMapping(path = "/save-employee")
    public Employee saveEmployee(@RequestBody Employee newEmployee){// yeni bir işçi kaydediyoruz
        return employeeService.saveEmployee(newEmployee);
    }

    @DeleteMapping("/delete-employee/{id}")
    public boolean deleteEmployee(@PathVariable (name = "id")String id){
       return true;
    }
}
