package day4;

public class LearnConstructor extends ParentConstructor {

	int x;
	String n;
	
	
	LearnConstructor(){
	super("bharathi");
		System.out.println("The Default constructor");
		
	}
	
	  LearnConstructor(int x, String n){
	  this();
	  System.out.println("This is a Parametrized constructor");
	  
	  }
	 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnConstructor cons1=new LearnConstructor(5,"Vidya");

		
	

		
	}

}
