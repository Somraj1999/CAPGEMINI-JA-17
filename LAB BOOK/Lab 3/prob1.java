import java.util.Scanner;

public class Int_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Length: ");
		int n=s.nextInt();
		int i,sum=0;
		int a[]=new int[n];
		
		for(i=0;i<n;i++)
		{
			System.out.print("Enter element" + i);
			a[i]=s.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("");
		System.out.println("");
		
		for(i=0;i<n;i++)
		{
			System.out.print(" " + a[i] + " ");
		}
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("SUM:" + sum);
	}

}
