package day1Exercises;

public class ExerciseA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary = 23000;
		double tax = 0.0;
		
		if(salary <= 10000.00) {
			tax = 0.10;
		} else if(salary <= 30000.00) {
			tax = 0.20;
		} else if(salary <= 50000.00) {
			tax = 0.30;
		} else {
			tax = 0.50;
		}
		
		double finalTax = salary * tax;
		System.out.println(finalTax);
		System.out.println("tax for this salary is: " + tax * 100 + " percent");
	}

}
