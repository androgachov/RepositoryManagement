package Project.DAO;

import java.util.List;
import Project.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    
        private SessionFactory sessionFactory;
        
        @Autowired
        public EmployeeDaoImpl (SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
        }
        
        private Session currentSession() {
            return sessionFactory.openSession();
        }
        
        @Override
	public List<Employee> findAllEmployees(){
            Session session = currentSession();
	    List<Employee> employees = (List<Employee>) session.createQuery("FROM Employee").list(); 
	    return employees;
        }  
	
        @Override
	public Employee findById(int id){
		Session session = currentSession();
                Employee emp = (Employee) session.get(Employee.class, id);
		return emp;
	}        
        
        @Override
	public void updateEmployee(Employee employee) {
	        Session session = currentSession();
                Employee existingEmployee = (Employee) session.get(Employee.class, employee.getId());
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setDepartment(employee.getDepartment());
                existingEmployee.setHoliday(employee.getHoliday());
                existingEmployee.setConHoliday(employee.getConHoliday());
                existingEmployee.setSalary(employee.getSalary());
		session.save(existingEmployee);
	}       
        
        @Override
	public void deleteEmployee(int id){	
                Session session = currentSession();
                Employee emp = (Employee) session.get(Employee.class, id);
                session.delete(emp);
        }
        
}
