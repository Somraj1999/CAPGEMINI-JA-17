import java.util.Scanner;

public class LAB1_OP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Number:");
		int n=s.nextInt();

		int i,sum=0,rem=0;

		do
		{
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		} while(n!=0);

		System.out.println("SUM:" + sum);
	}

}
