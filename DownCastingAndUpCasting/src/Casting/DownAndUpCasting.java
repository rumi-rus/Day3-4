package Casting;

interface Print{}  
class A implements Print{  
public void a(){System.out.println("a method");}  
}  
class B implements Print{  
public void b(){System.out.println("b method");}  
}  
  
class Call{  
void invoke(Print p){  //upcasting  
if(p instanceof A){  
A a=(A)p; //Downcasting   
a.a();  
}  
if(p instanceof B){  
B b=(B)p; //Downcasting   
b.b();  
}  
  
}  
}
  
public class DownAndUpCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p=new B();  
		Call c=new Call();  
		c.invoke(p); 
	}

}
