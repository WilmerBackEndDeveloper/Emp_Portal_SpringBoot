package io.aidenai.empportal.Empportal.Service_Emp;

import io.aidenai.empportal.Empportal.DTO_Emp.EmployeeBasicRepo;
import io.aidenai.empportal.Empportal.entity.Employee_BasicDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeBasicRepo employeeBasicRepo;

    public Employee_BasicDetails saveEmpl(Employee_BasicDetails employee){

        return employeeBasicRepo.save(employee);
    }

}
