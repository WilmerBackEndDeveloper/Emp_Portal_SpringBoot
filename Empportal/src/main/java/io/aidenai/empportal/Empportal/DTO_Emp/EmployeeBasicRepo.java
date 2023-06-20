package io.aidenai.empportal.Empportal.DTO_Emp;

import io.aidenai.empportal.Empportal.entity.Employee_BasicDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeBasicRepo extends JpaRepository<Employee_BasicDetails,Integer> {
}
