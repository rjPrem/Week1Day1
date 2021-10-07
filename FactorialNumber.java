package week1.day1;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factNum = 5;
		int fact = 1;
		for (int i = 1; i <= factNum; i++) {
			fact = fact * i;

		}
		System.out.println(factNum + "Factorial Value is" + fact);
	}

}
