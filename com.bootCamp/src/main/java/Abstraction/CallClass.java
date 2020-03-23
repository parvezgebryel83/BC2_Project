package Abstraction;

public class CallClass extends AbstractionBcamp {
	
	// To call AbstractionBcamp class, I use extend keyword to inherit both classes
	// Either manually write its method using @override annotation or right click on call class 
	// Click on implement unimplemented methods and then in class class instantiate call class
	// Create object for AbstractionBcamp class and called the override abstract and non abstract methods
	
	public static void main(String[] args) {

		CallClass obj = new CallClass ();
		obj.division();
		obj.multiplication();
		obj.subtration();
		obj.result();

	}

	@Override
	public void multiplication() {
	System.out.println("This is my multiplication");}

	@Override
	public void division() {
	System.out.println("This is my division ");	}

	@Override
	public void subtration() {
	System.out.println("This is my subtraction");	}
	@Override
	public void result () {
		System.out.println("This is my result/non abstract method");
	}
}
