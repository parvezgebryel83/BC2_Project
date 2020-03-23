package Strings;

public class TwoDarray {

	public static void main(String[] args) {// in this 2D array i store students mark
		//To store students mark we have to first determine type of data
		//Then we specify number of arrays by using two square brackets and give variable name;
		
		int [][] studentsmarks;
		
		studentsmarks = new int [2][2];//now here i specify values / 2 rows and 2 columns
		studentsmarks   [0][0] = 100;// first student's marks
		studentsmarks   [0][0] = 200;
		
		studentsmarks   [1][0] = 90; // second student's marks
		studentsmarks   [1][1] = 85;
		
		System.out.println(studentsmarks[0][0]);// print first student's marks
		System.out.println(studentsmarks[0][1]);
		
		System.out.println(studentsmarks[1][0]);// print second student's marks
		System.out.println(studentsmarks[1][1]);
		// TODO Auto-generated method stub

	}

}
