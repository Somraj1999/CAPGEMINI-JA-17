import java.util.Scanner;

public class ARRAY_SORT {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n=s.nextInt();
		int a[]=new int[100];
		int i,j;
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter element" + i);
			a[i]=s.nextInt();
		}
		
		int temp=0;
		
		if(n%2==0) 
		{
			for(i=0;i<n/2;i++)
			{
				temp=a[i];
				a[i]=a[(n-i-1)];
				a[(n-i-1)]=temp;
			}
			
		}
		
		else if(n%2==1)
		{
			int mid=(n-1)/2;
			for(i=0;i<mid;i++)
			{
				temp=a[i];
				a[i]=a[(2*mid-i)];
				a[(2*mid-i)]=temp;
			}
		}
		
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
		
		System.out.println("");
		System.out.println("");
		
		for (i = 0; i < n; i++) {     
	        for (j = i+1; j < n; j++) {     
	           if(a[i] > a[j]) {    
	               temp = a[i];    
	               a[i] = a[j];    
	               a[j] = temp;    
	           }     
	        }     
	    }    
		
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}

}

}
