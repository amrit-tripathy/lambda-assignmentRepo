package com.grayMatter;

//only one abstract method
//lambda is a anonymous expression===functional interface===no object expected===similar to inline functions

@FunctionalInterface
interface HelloInterface{
	
	public String sayHello();//only one abstract method required
}

@FunctionalInterface
interface PrintNameInterface{
	
	public void printName(String name);
}

@FunctionalInterface
interface AddInterface{
	public int add(int a,int b);
}

@FunctionalInterface
interface DisplayInterface{
	public void display();
}

public class DemoOnLambda  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//no parameters but with return 
		HelloInterface hi = ()-> {   return "hello.....";  }; //lambda function gives definition for sayHello method
		String s = hi.sayHello();
		System.out.println(s);
		
		PrintNameInterface pni =(name)->{//with parameters but no return
			System.out.println(name);
		};
		pni.printName("amrit");
		
		AddInterface adi = (a,b)->{//with parameters and return value
			return a+b;
		};
		System.out.println(adi.add(3, 4));
		
		DisplayInterface di =()->{ //no parameters and no return
			System.out.println("inside display method");
		};
		di.display();


	}

	
	

}
