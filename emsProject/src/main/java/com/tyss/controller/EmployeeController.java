package com.tyss.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tyss.ems.entity.Employee;

@Controller
public class EmployeeController {
	//save->save employee details
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	@RequestMapping("/save")
	public String saveEmployee(@RequestParam String name,@RequestParam String email,@RequestParam long phone,@RequestParam String password,@RequestParam double sal,Model m) {
		
		Employee e=new Employee();
		e.setName(name);
		e.setEmail(email);
		e.setPassword(password);
		e.setPhone(phone);
		e.setSal(sal);
		
		transaction.begin();
		manager.persist(e);
		transaction.commit();
		
		String msg="Employee saved Successfully..";
		m.addAttribute("msg",msg);
		
		return "home.jsp";
	}
	
	//fetchall-->fetch all the employees and move to view.jsp
	@RequestMapping("/fetchall")
	public ModelAndView fetchAllEmployee(ModelAndView mv) {
		
		Query query=manager.createQuery("from Employee");
		List<Employee> employees= query.getResultList();
		mv.setViewName("view.jsp");
		mv.addObject("employees",employees);
		return mv;
		
	}
	
	//delete the employee of the id coming in the request param
	@RequestMapping("/delete")
	public ModelAndView deleteEmployeeById(@RequestParam int id,ModelAndView mv) {
		Employee employee=manager.find(Employee.class,id);
		if(employee!=null) {
		transaction.begin();
		manager.remove(employee);
		transaction.commit();
		}
		return fetchAllEmployee(mv);
		
		}
	
	//update?id=2-->udpdate Employee details
	@RequestMapping("/update")
	public ModelAndView update(ModelAndView mv,@RequestParam int id) {
		
		Employee employee=manager.find(Employee.class, id);
		mv.addObject("employee",employee);
		mv.setViewName("update.jsp");
		
		return mv;
	}
	
	
	@RequestMapping("/updateemp")
	public ModelAndView updateEmp(@RequestParam int id,@RequestParam String name,@RequestParam String email,@RequestParam long phone,@RequestParam String password,@RequestParam double sal,ModelAndView mv) {
		
		Employee e=manager.find(Employee.class, id);
		e.setName(name);
		e.setEmail(email);
		e.setPassword(password);
		e.setPhone(phone);
		e.setSal(sal);
		
		transaction.begin();
		manager.merge(e);
		transaction.commit();
		
		return fetchAllEmployee(mv);
	}
	
}
