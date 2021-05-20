import java.util.*;

public class LAB1_MAN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Range");
		int n=s.nextInt();
		int i,sosqs=0,sqos,sum=0;
		
		for(i=1;i<=n;i++)
		{
			sosqs=sosqs+i*i;
		}
		
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		sqos=sum*sum;
		
		int result=(sosqs-sqos);
		
		System.out.println(Math.abs(result));
	}

}
