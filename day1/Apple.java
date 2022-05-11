package day1;

public class Apple extends Samsung{
	
	
	public void appleFeature() {
		System.out.println("Apple Mobile");
	}
	//Mobile->samsung->apple-hirerchial

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple apple=(Apple) new Mobile();
		
		int iMEIno2 = apple.IMEIno;
		System.out.println(iMEIno2);
		String name2 = apple.name;
		System.out.println(name2);
		apple.os();
		apple.model();
		apple.samsungFeature();
		
		Mobile obj=new Apple();
		
		
		
	}

}
