package com.rest.provider;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Singleton;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.employee.dao.EmployeeDAO;
import com.java.employee.Employee;

@Path("/")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Singleton
public class RestProvider {

	@GET
	public List<Employee> getEmployees_JSON() {
		List<Employee> list = EmployeeDAO.getAllEmployees();
		return list;
	}

	@GET
	@Path("/{empNo}")
	public Employee getEmployee(@PathParam("empNo") Integer empNo) {
		return EmployeeDAO.getEmployee(empNo);
	}

	@GET
	@Path("/name/{name}")
	public List<Employee> findByName(@PathParam("name") String name) {
		List<Employee> list = new ArrayList<>();
		for (Map.Entry<Integer, Employee> entry : EmployeeDAO.empMap.entrySet()) {
			if (entry.getValue().getEmpName().equals(name))
				list.add(entry.getValue());
		}
		if (list.size() == 0)
			return null;
		else
			return list;
	}

	@POST
	public Employee addEmployee(Employee emp) {
		return EmployeeDAO.addEmployee(emp);
	}

	@PUT
	public Employee updateEmployee(Employee emp) {
		return EmployeeDAO.updateEmployee(emp);
	}

	@DELETE
	@Path("/{empNo}")
	public void deleteEmployee(@PathParam("empNo") Integer empNo) {
		EmployeeDAO.deleteEmployee(empNo);
	}

}