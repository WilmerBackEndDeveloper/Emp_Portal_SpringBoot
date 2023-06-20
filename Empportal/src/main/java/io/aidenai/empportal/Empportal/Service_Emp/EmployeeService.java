package io.aidenai.empportal.Empportal.Service_Emp;

import io.aidenai.empportal.Empportal.DTO_Emp.EmployeeBasicRepo;
import io.aidenai.empportal.Empportal.entity.Employee_BasicDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeBasicRepo employeeBasicRepo;

    public Employee_BasicDetails saveEmpl(Employee_BasicDetails employee){

        return employeeBasicRepo.save(employee);
    }


    public List<Employee_BasicDetails> findAll() {
        return employeeBasicRepo.findAll();
    }

    public Optional<Employee_BasicDetails> findById(int id) {
        return employeeBasicRepo.findById(id);
    }




    public Employee_BasicDetails updateEmployee(Employee_BasicDetails newEmployee, int id) {

        return employeeBasicRepo.findById(id).map(employee -> {
            employee.setEmpname(newEmployee.getEmpname());
            employee.setEmail(newEmployee.getEmail());
            employee.setPhone(newEmployee.getPhone());
            return employeeBasicRepo.save(employee);
        }).orElseGet(() -> {
            newEmployee.setEmpid(id);
            return employeeBasicRepo.save(newEmployee);
        });
    }

    public void deleteById(int id) {
        employeeBasicRepo.deleteById(id);
    }




}
