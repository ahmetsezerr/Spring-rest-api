package com.ahmetsezer.springrestapi.Service;

import java.util.List;

import com.ahmetsezer.springrestapi.Model.Employee;
import com.ahmetsezer.springrestapi.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // bu anatasyonu yazınca bean oluşuyo ıoc container da
public class EmployeeService {

    @Autowired //ile enjekte ettim
    private EmployeeRepository employeeRepository;// benim Service katmanından da repository katmamına geçiş yapmam lazım

    public List<Employee>getAllEmployeeList(){
       // employeeRepository.getAllEmployeeList(); // diyorum ki service benim employeeRepositorym var sen onun içindeki getAllEmployees() metoduna git diyor.
        return employeeRepository.getAllEmployeeList();


        }


    public Employee getEmployeeById(String id) {
        return employeeRepository.getEmployeeById(id);
    }
}
