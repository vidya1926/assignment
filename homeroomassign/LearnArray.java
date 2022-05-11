package homeroomassign;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //Array -store collection of values with similar datatype under a single variable
	//Array is of fixed size/static
	//Value of the array will be stored starting from the 0- index starts from zero	
		//Declaration of Array
		int[] number= {1,2,3,4,5,6} ;//0,1,2,3,4,5
		int[] arr=new int[5];
		System.out.println();
		
		String[] name= {"Vidya","princilla","Testleaf"};
		
		
		
		//int[] arr=new int[5];
		arr[0]=1;
		
		
		int length = number.length;
			
		
		System.out.println(Arrays.toString(number));
		
		for(int i=0;i<number.length;i++) {
			System.out.println("Element at "+i+ " th Position "+number[i]);
		}
		
		//ctrl+2
		for(Integer num:number) {
			System.out.println("Using for each loop :" +num);
		}
				
		int[] number2= {1,4,2,6,3};
		
		Arrays.sort(number2);
		
		System.out.println("Sorted array" +Arrays.toString(number2));
		
		System.out.println(Arrays.toString(name));
		
		char[] ch= {'c','r','t'};
		
		System.out.println(Arrays.toString(ch));

		
		System.out.println("**********");
		
		for(int i=number.length-1;i>=0;i--) {
			
			System.out.println(number[i]);
		}
		
		
		
		
		
	//	System.out.println(number2);

	}

}
