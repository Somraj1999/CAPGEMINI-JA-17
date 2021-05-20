import java.util.Scanner;

public class LAB1_MAN4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Number:");
		int a=s.nextInt();
		int i,rem=0;

		do
		{
			rem=a%2;
			a=a/2;
		} while(a!=1);

		if(rem==0)
		{
			System.out.println("Number is a power of 2.");
		}

		else
		{
			System.out.println("Number is not a power of 2.");
		}
	}

}
