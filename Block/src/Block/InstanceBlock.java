package Block;

class A{  
A(){  
System.out.println("parent class constructor invoked");  
}  
int printname(int a) {
	
	//System.out.println("Enter name");
	return(2);
}
float printname(float a) {
	return(14.4f);
}
long printname(long a) {	return 12;}

}  

 
public class InstanceBlock extends A {

	InstanceBlock(){  
		super();  
		System.out.println("child class constructor invoked");  
		}  
		  
		{System.out.println("instance initializer block is invoked");}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceBlock b=new InstanceBlock();  
		System.out.println(b.printname(12345678900l));
		//b.printname(0)
	}

}
