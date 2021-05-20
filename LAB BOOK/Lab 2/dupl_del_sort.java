import java.util.Scanner;

public class REMOVE_DUPLICATE_SORT {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n=s.nextInt();
		int a[]=new int[100];
		int i,j,k,count=0;
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter element" + i);
			a[i]=s.nextInt();
		}
		
		for(i=0; i<n; i++)
	    {
	        for(j=i+1; j<n; j++)
	        {
	            if(a[i] == a[j])
	            {
	                for(k=j; k < n - 1; k++)
	                {
	                    a[k] = a[k + 1];
	                }

	                j--;
	            }
	        }
	    }
		
	    for(i=0; i<n; i++)
	    {
	        System.out.print(a[i]);
	    }
		
	}
}
