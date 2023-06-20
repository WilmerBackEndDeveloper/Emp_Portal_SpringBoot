package io.aidenai.empportal.Empportal.Controller_Emp;

import io.aidenai.empportal.Empportal.Service_Emp.EmployeeService;
import io.aidenai.empportal.Empportal.entity.Employee_BasicDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/Save_Emplo")
    public void SaveEmp(@RequestBody Employee_BasicDetails employee)
    {

        employeeService.saveEmpl(employee);
    }

}
