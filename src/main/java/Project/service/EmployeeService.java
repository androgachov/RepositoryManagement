package Project.service;

import Project.DAO.EmployeeDao;
import Project.model.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeDao userDao; 
    
    @Transactional(readOnly = true, propagation=Propagation.SUPPORTS)
    public List<Employee> findAllEmployees() {
        return userDao.findAllEmployees();
    }   
    
    @Transactional
    public void findById(int id) {
        userDao.findById(id);
    }       
    
    @Transactional
    public void updateEmployee(Employee employee) {
       userDao.updateEmployee(employee);
    }
    
    @Transactional
    public void deleteEmployee(int id){
	userDao.deleteEmployee(id);
    }  
    
}
