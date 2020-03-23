package Methods;

public class ReturnableMethods {

	public static void main(String[] args) {
	int January =  profit(250000, 800000); // now using int datatype, we declare a variable with return
	int Feberuary = profit(240000,  700000);
	int March = profit(220000, 600000);

	}
	public static int profit(int income, int expense) {
		
		//int income = 250000;
		//int expense = 800000;
		int netprofit = income - expense;
		System.out.println("My monthly saving is :"+netprofit);
		return netprofit;// here we type return keyword to instruct our method to give us the return value
	}
	
	

}
