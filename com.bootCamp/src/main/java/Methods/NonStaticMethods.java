package Methods;////Instance methods: These methods act upon the instance variables of a class(returns value)

public class NonStaticMethods {// this class is created to call non static methods in static method

	public static void main(String[] args) {
		NonStaticMethods call = new NonStaticMethods ();// here i have instantiated the non static methods by giving an object instance
		call.car();// these are non static methods which i called them by an object of its main class
		call.bike();
	}

	public void car() {
	System.out.println("My favorite SUV is Ford Explorer"); }
	
	public void bike() {
		System.out.println("I dont like bikes");
	}

}
