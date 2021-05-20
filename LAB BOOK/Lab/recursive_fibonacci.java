import java.util.Scanner;

public class LAB1_OP3_2 {

	public static int fibonacci_function(int n)
	{
		if (n <= 1) {
			return n;
		}

		return fibonacci_function(n - 1) + fibonacci_function(n - 2);
	}

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Position:");
		int n=s.nextInt();
		System.out.println("Number at position " + n + " is " + fibonacci_function(n));
	}

}
