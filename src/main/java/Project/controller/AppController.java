package Project.controller;

import Project.model.Employee;
import Project.service.EmployeeService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AppController {

    @Autowired
    EmployeeService service;
	
    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public String listAllEmployees(ModelMap model) {
 
        List<Employee> employees = service.findAllEmployees();
        model.addAttribute("employees", employees);
        return "allemployees";
    }
	
    @RequestMapping(value = { "/edit-employee-{id}" }, method = RequestMethod.GET)
    public String editEmployee(@PathVariable int id, ModelMap model) {
        service.findById(id);
        model.addAttribute("employee", new Employee());
        model.addAttribute("edit", true);
        return "registration";
    }
    
    @RequestMapping(value = { "/edit-employee-{id}" }, method = RequestMethod.POST)
    public String updateEmployee(Employee employee, ModelMap model, @PathVariable int id) {
        service.updateEmployee(employee);
        model.addAttribute("success", "Employee " + employee.getFirstName()  + " updated successfully");
        return "success";
    }  
    
    @RequestMapping(value = { "/delete-employee-{id}" }, method = RequestMethod.GET)
    public String deleteEmployee(@PathVariable int id) {
        service.deleteEmployee(id);
        return "redirect:/list";
    }
    
	@RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
	public String accessDeniedPage(ModelMap model) {
		return "accessDenied";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){    
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
	}

}