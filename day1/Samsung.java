package day1;

public class Samsung extends Mobile {
	
	public void samsungFeature() {
		System.out.println("Android");
	}
	
	public void os() {
		System.out.println("Type of samsung ");
		super.os();
	}
	
	
	public static void main(String[] args) {
		
		Samsung mobile= new Samsung();
		
		mobile.os();
		mobile.samsungFeature();
		mobile.model();
		
	     System.out.println(mobile.IMEIno );	
	     System.out.println(mobile.name );	

	}
	

}
