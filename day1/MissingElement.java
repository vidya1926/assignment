package day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//missing one element in the array
		 int[] arr = {1,2,4,5,6,7,8};
	        Arrays.sort(arr);
	       
	        for (int i = 1; i < arr.length; i++) {    	
	           if(arr[i-1]!=i) {
	                System.out.println(i);
	                break;
	            }
	        }
	        
	        //missing two elements in the array
	    	int[] arr1 = {2,5,3,9};
	    	Arrays.sort(arr1);
	    	
	    	System.out.println(Arrays.toString(arr1));
	    	
	    	for (int i = 0; i < arr1.length-1; i++) {
				/*
				 * System.out.println("array value  :" +arr1[i]);
				 * System.out.println("input value :" +i); System.out.println(arr1[i]+1);
				 * System.out.println(arr1[i+1]);
				 */

	    		if (arr1[i]+1 !=arr1[i+1]) {	    			
	    		
	    			System.out.println(arr1[i]+1);
	    			
	    		}else {
	    			System.out.println(arr[i+2]);
	    		}
	    	}
	        
	

	}}
