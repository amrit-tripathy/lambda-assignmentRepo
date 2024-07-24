package com.grayMatter;

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
public class Employee {
	private String Name;
	private int id;
	private int salary;

}
