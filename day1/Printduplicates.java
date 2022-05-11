package day1;

public class Printduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] arr= {12,13,23,45,12,34,23,18,34};  
  int count;  
  for(int i=0;i<=arr.length-1;i++) {
	  count=0;
	  for(int j=i+1;j<=arr.length-1;j++)
	  {
		  if(arr[i]==arr[j]) {
			  count++;
		  }
	  }
	  
	  if(count>=1)
	  {
		  System.out.println("Duplicated value " +arr[i] );
	  }
	  
  }
		
		
		
	}

}
