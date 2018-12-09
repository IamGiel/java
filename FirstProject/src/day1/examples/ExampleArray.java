package day1.examples;

public class ExampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
//		int b = 20;
//		int c = 30;
		int[] a = {10, 20, 30, 40, 50};
		System.out.println(a[0] + a[2]);
		System.out.println("-----looping through values in an array------");
		for(int temp: a) {
			System.out.println(temp);
		}
		
		int[] x = new int[10];
		x[3] = 25;
		System.out.println("----looping through integers and insert a new value on a cetain index of the array-------");
		for(int temp2: x) {
			System.out.println(temp2);
		}
		System.out.println("-----looping through strings------");
		String[] st = {"one", "two", "three"};
		for(String temp3: st) {
			System.out.println(temp3);
		}
		
		System.out.println("-----------");
		

		
		
	}

}
