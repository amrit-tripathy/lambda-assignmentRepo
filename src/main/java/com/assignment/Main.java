package com.assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(1, "amrit");
		hm.put(2, "abcd");
		hm.put(3, "vdfdgd");
		//convert hashmap to entryset to use stream
		Set<Entry<Integer,String>> st =hm.entrySet();
		st.stream().filter(entry->entry.getValue().startsWith("a")).forEach(e->System.out.println(e));
		
		//sort strings in alphabetical order
		List<String> lis = new ArrayList<String>();
		lis.add("amrit");
		lis.add("abcd");
		lis.add("dddd");
		lis.add("ftyj");
		
//		lis.stream().sorted().forEach(e->System.out.println(e));
		lis.sort((s1,s2)->
			s1.compareTo(s2)
		);
		//lis.sort((s1, s2) -> Character.compare(s1.charAt(s1.length() - 1), s2.charAt(s2.length() - 1))); //sort on last character
		lis.forEach((s)->{
			System.out.println(s);
		});
		
		
		List<Double> db = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0));
		System.out.println(db.stream().mapToDouble(Double::doubleValue).average().getAsDouble());
		
		//check prime or not
		Predicate<Double>isprime = (num)->{
			
			if(num==1) {
				return false;
			}
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
			
		};
		
		for(Double d:db) {
			if(isprime.test(d)) {
				System.out.println("number is prime:"+d);
			}
		}
		
		 String str1 = "Hello, ";
	     String str2 = "world!";
	     
		BinaryOperator<String> concat = (s1,s2)->s1+s2;  //if you want to do anything with 2 objects of same type use this
		String result = concat.apply(str1, str2);
		System.out.println(result);
		
		//count no. of words in a para
		String paragraph = "This is a sample paragraph. It contains several words that we want to count.";
		
//		String arr[] = paragraph.split("\\s");
//		System.out.println(arr.length);
		System.out.println(Arrays.stream(paragraph.split("\\s")).count());
		
		
		
		
		
		
		
		
	}

}
