package io.aidenai.empportal.Empportal.Controller_Emp;

import io.aidenai.empportal.Empportal.Service_Emp.EmployeeService;
import io.aidenai.empportal.Empportal.entity.Employee_BasicDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //Save Employee
    @RequestMapping("/Save_Emplo")
    public void SaveEmp(@RequestBody Employee_BasicDetails employee)
    {

        employeeService.saveEmpl(employee);
    }

    //Get Employee By Id
    @GetMapping("/Get_Emp_ById/{emp_id}")
    @ResponseBody
    public Optional<Employee_BasicDetails> getEmployeeById( @PathVariable("emp_id") int emp_id)
    {
        return employeeService.findById(emp_id);
    }


    //Get All Employee
    @GetMapping("/getAll")
    public List<Employee_BasicDetails> getAll()
    {
        return employeeService.findAll();
    }

    //Update Employee
    @PutMapping("/update-employee/{id}")
    Employee_BasicDetails updateEmployee(@RequestBody Employee_BasicDetails newEmployee, @PathVariable int id){
       return employeeService.updateEmployee(newEmployee,id);
    }

    //Delete Employee
    @DeleteMapping("/delete-emp/{id}")
    void deleteEmployee(@PathVariable int id) {
        employeeService.deleteById(id);
    }

}
