package day1;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Java";
		
		float x=0.05f;
		
		int y=0;
		float g=0;
		
		try {
			int z=(int)x/y;
			System.out.println(z);
			 g=z/x;
		} catch (ArithmeticException e) {
          System.out.println(e);		}
		

	}

}
