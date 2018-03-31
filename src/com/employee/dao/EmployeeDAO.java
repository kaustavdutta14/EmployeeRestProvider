package com.employee.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.java.employee.Employee;
 
public class EmployeeDAO {
 
    public static final Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
 
    static {
        initEmps();
    }
 
    private static void initEmps() {
        Employee emp1 = new Employee(1, "Smith", "Clerk");
        Employee emp2 = new Employee(2, "Allen", "Salesman");
        Employee emp3 = new Employee(3, "Jones", "Manager");
 
        empMap.put(emp1.getId(), emp1);
        empMap.put(emp2.getId(), emp2);
        empMap.put(emp3.getId(), emp3);
    }
 
    public static Employee getEmployee(Integer empNo) {
        return empMap.get(empNo);
    }
 
    public static Employee addEmployee(Employee emp) {
        empMap.put(emp.getId(), emp);
        return emp;
    }
 
    public static Employee updateEmployee(Employee emp) {
        empMap.put(emp.getId(), emp);
        return emp;
    }
 
    public static void deleteEmployee(Integer empNo) {
        empMap.remove(empNo);
    }
 
    public static List<Employee> getAllEmployees() {
        Collection<Employee> c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
    }
     
    List<Employee> list;
 
}