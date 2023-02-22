package inheritance;
class Employee{  
	 float salary=40000;  
	 private int id=12;
	 private void empid() {
		 System.out.println("inside parent class");
	 }
	}  
public class ExampleClass extends Employee {
	int bonus=10000; 
	//void empid() {
	//	 System.out.println("inside child class");
	 //}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			 
			 
			   ExampleClass p=new ExampleClass();  
			   System.out.println("Programmer salary :"+p.salary);  
			   System.out.println("Bonus of Programmer:"+p.bonus);  
			   //System.out.println("Id of Programmer:"+p.id);
			   //p.empid();
	} 
	

}