package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    @Test
    void printSalariesTestNull()
    {
        app.printSalaries(null);
    }

    @Test
    void printSalariesTestEmpty()
    {
        ArrayList<Employee> employess = new ArrayList<Employee>();
        app.printSalaries(employess);
    }

    @Test
    void printSalariesTestContainsNull()
    {
        ArrayList<Employee> employess = new ArrayList<Employee>();
        employess.add(null);
        app.printSalaries(employess);
    }

    @Test
    void printSalaries()
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        employees.add(emp);
        app.printSalaries(employees);
    }

    @Test
    void displayEmployeeTestNull() {
        app.displayEmployee(null);
    }

    @Test
    void displayEmployeeTestValid() {
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "John";
        emp.last_name = "Doe";
        emp.title = "Manager";
        emp.salary = 60000;
        app.displayEmployee(emp);
    }

    @Test
    void displayEmployeeTestWithNullFields() {
        Employee emp = new Employee();
        emp.emp_no = 2;
        emp.first_name = "Jane";
        // Last name is null
        // Title is null
        emp.salary = 50000;
        app.displayEmployee(emp);
    }

    @Test
    void displayEmployeeTestNullEmployee() {
        app.displayEmployee(null);
    }

}