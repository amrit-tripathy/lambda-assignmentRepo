package com.grayMatter;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnBuiltinFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer = (i)->{
			System.out.println(i);
		};
		consumer.accept(78);//it executes the lambda method
		System.out.println("*************");
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(89);
		alist.add(67);
		alist.add(45);
		alist.add(77);
		alist.add(67);
		alist.add(45);
		
//		alist.forEach((i)->{
//			System.out.println(i);
//		});
		alist.forEach(consumer);//same output
		
		Supplier<String> supplier = ()->{
			
			return "hello tt";
		};
		System.out.println(supplier.get());
		
		Predicate<Integer> predicate = (num)->{ //predicate always return boolean value
			return num%2==0;
		};
		
		int arr[] = {2,34,45,67,77,88};
		for(int i:arr) {
			if(predicate.test(i)) {
				System.out.println(i);
			}
		}
		
		Function<Integer, Integer> function = (num)->{
			int fact =1;
			for(int i=1;i<=num;i++) {
				fact =fact*i;
			}
			return fact;
		};
		
		System.out.println(function.apply(5));
		
		
	}

}
