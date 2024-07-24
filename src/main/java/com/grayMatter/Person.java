package com.grayMatter;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor     //benifits of lombak no need to update constructor or getter and setters 
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
	
	private String name;
	private int age;
	private String dob;
	
	

}
