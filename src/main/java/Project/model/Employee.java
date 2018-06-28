package Project.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "EMPLOYEE_ID", unique = true, nullable = false)
    private int id;
    
    @Column(name = "FIRSTNAME", nullable = false, length = 50)
    private String firstName;
    
    @Column(name = "LASTNAME", nullable = false, length = 50)
    private String lastName;
    
    @Column(name = "DEPARTMENT", nullable = false, length = 50)
    private String department;

    @Column(name = "HOLIDAY", nullable = false, length = 50)
    private String holiday;
    
    @Column(name = "CONFIRM_HOLIDAY", nullable = false, length = 50)
    private String conHoliday;
    
    @Column(name = "SALARY", nullable = false)
    private Integer salary;
    
    public Employee() {
    }
    
    public Employee(int id, String firstName, String lastName, String department,
            String holiday, String conHoliday, Integer salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.holiday = holiday;
        this.conHoliday = conHoliday;
        this.salary = salary;
    }
   
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }   
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
 
    public String getHoliday() {
        return holiday;
    }
    
    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    public String getConHoliday() {
        return conHoliday;
    }
    
    public void setConHoliday(String conHoliday) {
        this.conHoliday = conHoliday;
    }    
    
    public Integer getSalary() {
        return salary;
    }
        
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "id=" + id + "; firstName=" + firstName + "; lastName=" + lastName + "; department=" + department +
                "; holiday=" + holiday + "; conHoliday=" + conHoliday + "; salary=" + salary;
    }
    
}
