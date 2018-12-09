package day1.examples;

public class ExampleIf {
	public static void main(String[] args) {
		int x = 20;
		int y = 21;
		
		if(x < y) {
			System.out.println("x is less than y");
		} else if(x > y) {
			System.out.println("y is less than x");
		} else if(x == y) {
			System.out.println("x equal y");
		}
	}
}
