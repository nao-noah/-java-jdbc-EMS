package com.ems.dao;

import com.ems.dto.Employee;
import com.ems.exceptions.EmployeeNotFoundException;

import java.util.List;

/**
 * EmployeeDAO - Data Access Object
 */
public interface EmployeeDAO {
    public abstract void addEmployee(Employee e);
    public abstract void deleteEmployee(int id);
    public abstract void updateEmployee(int id, String newName)
    public abstract Employee findEmployee(Employee e) throws EmployeeNotFoundException;
    public List<Employee> showAllEmployees();

    public static final String URL = "jdbc:mysql://localhost:3306/employees_database";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "password";
    public static final String DRIVER_CLASSNAME = "com.mysql.jdbc.Driver";
}
