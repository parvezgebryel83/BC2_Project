package Methods;

//Instance methods: These methods act upon the instance variables of a class(returns value)
//Factory methods: A factory method is a method that returns an object to the class to which it belongs

public class ParameterizedMethods {

	public static void main(String[] args) {
		profit(250000, 800000);// if i want  for 5 months, i can copy and paste it 4 more times
		profit(240000, 700000);
		profit(220000, 60000);
		profit(280000, 800000);
	}
	public static void profit(int income, int expense) {
		//int income = 250000;
		//int expense = 800000;
		int netprofit = income - expense;
		System.out.println("My monthly saving is :"+netprofit);
		// TODO Auto-generated method stub

	}

}
