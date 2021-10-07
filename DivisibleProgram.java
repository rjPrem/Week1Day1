package week1.day1;

public class DivisibleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 25;

		if (number%3 == 0)
			{
			System.out.println("TRIZZ");
			}
		else if (number%5 == 0 )
			{
			System.out.println("FIZZ");
			}
		else if (number%3 == 0 && number%5 == 0)
			{
			System.out.println("TRIZZ & FIZZ");
			}
		else 
			{
			System.out.println("Not TRIZZ & FIZZ");
			}
			}
	}

