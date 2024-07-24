package com.grayMatter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonMains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> lis = new ArrayList<Person>();
		Person p1 = new Person("Amrit",22,"18/10/2001");
		Person p2 = new Person("aaaa",35,"13/10/2003");
		Person p3 = new Person("bbbb",40,"12/10/2005");
		Person p4 = new Person("cccc",45,"11/10/2004");
		Person p5 = new Person("dddd",21,"19/10/2002");
		
		lis.add(p1);
		lis.add(p2);
		lis.add(p3);
		lis.add(p4);
		lis.add(p4);
		lis.add(p5);
		
		for(Person p:lis) {
			if(p.getAge()>=35 && (p.getName().startsWith("a")||p.getName().startsWith("A")) ){
				System.out.println(p);
			}
		}
		
		
		
	}

}
