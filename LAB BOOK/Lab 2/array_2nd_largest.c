import java.util.*;

public class ARRAY_SECOND_LARGEST {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Length of array:");
		int n=s.nextInt();
		int i;
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter element" + i);
			a[i]=s.nextInt();
		}
		
		int max=a[0];
		
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		int max2=0;
		
		for(i=0;i<n;i++)
		{
			if(a[i]>max2 && a[i]<max)
			{
				max2=a[i];
			}
		}
		
		System.out.print("2nd Largest Element is" + max2);
	}

}
