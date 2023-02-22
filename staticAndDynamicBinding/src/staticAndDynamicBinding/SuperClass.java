package staticAndDynamicBinding;

public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewClass A=new NewClass();
		NewClass B=new ChildClass();
		
		A.print();
        B.print();
	}

}
