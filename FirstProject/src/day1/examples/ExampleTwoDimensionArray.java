package day1.examples;

public class ExampleTwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] TwoDim = new int[4][3];
		
		System.out.println("-----assigning data to two dimensional array------");
//		TwoDim[3][2] = 10;
//		System.out.println("this two dimensional array: " + TwoDim[3][2]);
		int temp = 10;
		System.out.println("-----------");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				temp += 10;
				System.out.print(TwoDim[i][j] = temp);
				
				
				
			}
			System.out.println();
		}

	}

}
