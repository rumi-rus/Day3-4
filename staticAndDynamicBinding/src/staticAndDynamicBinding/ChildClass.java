package staticAndDynamicBinding;

public class ChildClass extends NewClass {
	ChildClass(){
		System.out.println("const of childclass");
	}
	 void print()
    {

        // print statement
        System.out.println(
            "print() in childclass is called");
    }
}
