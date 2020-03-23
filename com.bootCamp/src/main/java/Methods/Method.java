package Methods;
//	Static methods: A static method is a method that can be called and executed without creating an object.

public class Method {// static method

	public static void main(String[] args) {// main method
		profit();
	}

	public static void profit() {// created a static method here// now we declare int variables and values

		int income = 250000;
		int expense = 80000;
		int netprofit = income - expense;
		System.out.println("My annual saving is :" + netprofit);
	}

}
