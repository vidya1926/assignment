package day4;

public class ChildClass extends ParentClass {
	int num=15;
	
	public void parent() {
		int x=13;
		super.parent();
		System.out.println(super.num);
		System.out.println("I am from ChildClass" +x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass call=new ChildClass();
		System.out.println(call.num);
		call.parent();
		
		
	}

}
