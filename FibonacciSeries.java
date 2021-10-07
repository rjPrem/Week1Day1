package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 8;
		
		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;
		
		
		for (int i = 0; i < num ; i++) {
			
			
			sum = firstNum + secondNum;
			System.out.println("The Fibnocci Numbers are:" + sum );
			firstNum = secondNum;
		   secondNum  = sum ;
			
		}
				
		
	}

}
