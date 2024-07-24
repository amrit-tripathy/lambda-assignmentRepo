package com.grayMatter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeMains {
	public static void main(String[] args) {
		
		List<Employee>employees = new ArrayList<Employee>();
		Employee emp1 = new Employee("aaa", 1, 50000);
        Employee emp2 = new Employee("bbb", 2, 55000);
        Employee emp3 = new Employee("ccc", 3, 60000);
        Employee emp4 = new Employee("dddd", 4, 65000);
        Employee emp5 = new Employee("eee", 5, 30000);
        Employee emp6 = new Employee("ff", 6, 35000);
        Employee emp7 = new Employee("ggg", 7, 30000);
        Employee emp8 = new Employee("hhhh", 8, 85000);
        Employee emp9 = new Employee("iiii", 9, 30000);
        Employee emp10 = new Employee("jjj", 10, 35000);
        
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        employees.add(emp8);
        employees.add(emp9);
        employees.add(emp10);
        
        Predicate<Integer> pred =(sal)->{
        	return sal>=50000;
        };
        int i=0;
        for(Employee e:employees) {
        	if(pred.test(e.getSalary())) {
        		e.setSalary(e.getSalary()+5000);
        		
        	}
        	else {
        		e.setSalary(e.getSalary()+2000);
        	}
        	i++;
        }
         for(Employee e:employees) {
        	 System.out.println(e);
         }
        
        
        
        
	}

}
