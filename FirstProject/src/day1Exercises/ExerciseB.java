package day1Exercises;

public class ExerciseB {

	public static void main(String[] args) {
		
//		turn string of numbers to number and sum it all up

		int total = 0;
		String[] nums = {"10", "20", "20", "40"};
		int[] num = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
		    int neki = Integer.parseInt(nums[i]);
		    num[i] = neki;
			System.out.println(num[i]);
			total+= num[i];

		}
		System.out.println("-----total-----");
		System.out.println(total);
		
//		turn string of numbers to number and sum it all up
		System.out.println("-----LESS CODE-----");
		String[] num2 = {"10", "20", "20", "40"};
		
		int total2 = 0;
		for(String temp : num2) {
			total2 += Integer.parseInt(temp);
		}
		System.out.println(total2);
	}
	
	

}
