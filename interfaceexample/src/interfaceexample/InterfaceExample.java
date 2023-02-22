package interfaceexample;

interface Drawable{
	void draw();
}
class Circle implements Drawable{
	public void draw(){
		System.out.println("drawing circle");}
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
		d.draw();  
	}

}
