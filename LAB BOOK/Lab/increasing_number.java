import java.util.*;

public class LAB1_MAN3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("NUMBER:");
		int n=s.nextInt();
		int i=0,rem=0,rem1=0,count=0;
		
		for(i=0;i<=n;i++)
		{
			rem=n%10;
			n=n/10;
			rem1=rem;
			rem=n%10;
			
			if(rem1<rem)
			{
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("Increasing  Number");
		}
		
		else
		{
			System.out.println("Not Increasing  Number");
		}
	}

}
