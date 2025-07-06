package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static EmployeeService employeeService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		employeeService = context.getBean(EmployeeService.class);

		testAddEmployee();
		testGetAllEmployees();
	}

	private static void testAddEmployee() {
		LOGGER.info("Start - Add");
		Employee emp = new Employee(1, "John Doe", "IT", 60000.0);
		employeeService.addEmployee(emp);
		LOGGER.info("End - Add");
	}

	private static void testGetAllEmployees() {
		LOGGER.info("Start - Get All");
		List<Employee> list = employeeService.getAllEmployees();
		LOGGER.info("Employees: {}", list);
		LOGGER.info("End - Get All");
	}
}
