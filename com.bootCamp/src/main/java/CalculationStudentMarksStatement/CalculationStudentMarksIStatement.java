package CalculationStudentMarksStatement;

public class CalculationStudentMarksIStatement {
	public static void main(String [] args) {
		
		// This program assumes students marks are catagorized in to three catagories A, B and C
		
		int mark = 95; // first we declare data type and variable and give it a value
		if( mark > 90 && mark <100) {// now using if else condition i calculate my students mark and grades/ i can also use other options like switch and loops
		System.out.println("Grade A");
		}else if (mark > 80 && mark  < 89) {
			System.out.println("Grad B");
		}else if (mark > 70 && mark < 79) {
			System.out.println("Grade C");
		}else {System.out.println("Wish you best of luck in the future");
		}
	}

}
