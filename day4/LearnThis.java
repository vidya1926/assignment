package day4;

public class LearnThis extends ParentClass{
  
    
  public void add() {
	System.out.println(ParentClass.num);
	   System.out.println(this.num);
	   System.out.println(num);
	   
  }
  public void parent() {
	  super.parent();
	  System.out.println("child");
  }
	
  public void method1(int num)
  {
	  
	 this.add();
	 this.num=num;
	  System.out.println(num);
  }
	

}
