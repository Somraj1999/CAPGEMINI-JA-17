import java.util.*;

public class LAB1_MAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Range:");
		int n=s.nextInt();
		int i,sum=0;

		for(i=0;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}

		System.out.println("SUM:" + sum);
	}

}
