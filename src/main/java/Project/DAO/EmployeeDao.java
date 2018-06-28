package Project.DAO;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;

import Project.model.Employee;


public interface EmployeeDao {

	List<Employee> findAllEmployees();

	Employee findById(int id);

	@PreAuthorize("hasRole('ADMIN') OR hasRole('DBA')")
	void updateEmployee(Employee employee);
	
	@PreAuthorize("hasRole('ADMIN') AND hasRole('DBA')")
	void deleteEmployee(int id);
}