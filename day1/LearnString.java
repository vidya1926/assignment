package day1;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String -class
		// -immutable-we can't edit the value
		// declare the string 2 ways
		// -literals
		// -using new operator

		String s = "Testleaf"; // 100
		System.out.println(s.hashCode());
		String s2 = "testleaf";// 102 ->point
		s2 = "learning";
		s = s.concat(s2);

		System.out.println(s.hashCode());
		
		
		
		
		
		
		
		
		
		
		

	}

}
