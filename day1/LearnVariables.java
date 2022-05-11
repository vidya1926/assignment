package day1;

import java.util.Scanner;

public class LearnVariables {
	static int a = 10;
	int b = 15;
 float c=5.8f;
	int x=(int)c;
	
	public String add(String name) {
		int c = 25;
		System.out.println(a + b + c);
		System.out.println(name);
		sub();
		return name;
	}

	public static int sub() {

		int d = 5;
		System.out.println(a - d);
		LearnVariables var = new LearnVariables();
		return d;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(a, b);

		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * int age = input.nextInt(); String next = input.next();
		 * 
		 * System.out.println("Enter the age: " + age);
		 * 
		 * System.out.println(age + 5);
		 */
		
		  LearnVariables var= new LearnVariables();
		  
		  System.out.println(a); 
		  
		  var.add("Vidya");
		  
		  sub();
		 

	}

}
