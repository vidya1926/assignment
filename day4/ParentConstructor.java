package day4;

public class ParentConstructor {
	ParentConstructor(String n){
		System.out.println("I am from parent Constructor" +n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentConstructor pc=new ParentConstructor("Vidya");
	}

}
