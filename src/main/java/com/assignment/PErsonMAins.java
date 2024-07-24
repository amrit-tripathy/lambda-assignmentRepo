package com.assignment;

import java.util.HashSet;
import java.util.function.Predicate;

public class PErsonMAins {

	public static void main(String[] args) throws AgeNotSufficientException {
		// TODO Auto-generated method stub

		HashSet<Person> hs =new HashSet<Person>();
		 	Person person1 = new Person("Alice", 15, "New York", "1234 5678 9012");
	        Person person2 = new Person("Bob", 10, "London", "9876 5432 1098");
	        Person person3 = new Person("Charlie", 28, "Paris", "5678 9012 3456");
	        Person person4 = new Person("David", 35, "Tokyo", "4321 8765 2109");
	        Person person5 = new Person("Eve", 27, "Sydney", "8765 4321 0987");
	        
	        hs.add(person1);
	        hs.add(person2);
	        hs.add(person3);
	        hs.add(person4);
	        hs.add(person5);
	        
	        Predicate<Person> pred = (p)->{
	        	if(p.getAge()<18) {
	        		return true;
	        	}
	        	return false;
	        	
	        };
	        
	        for(Person p:hs) {
	        	if(pred.test(p)) {
	        		throw new AgeNotSufficientException("age is below 18");
	        	}
	        	else {
	        		System.out.println("Person name: "+p.getName() +" is eligile to cast vote");
	        	}
	        }
	        
	        
	}

}
