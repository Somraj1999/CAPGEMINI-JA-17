import java.util.*;

public class LAB1_OP4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i, j,number,count; 
		  
		 Scanner s = new Scanner(System.in);
		  System.out.println(" NUMBER:"); 
		  number=s.nextInt();
		  
		  for(j = 1; j <= number; j++)
		  {
		    count = 0;
		    for (i = 2; i <= j/2; i++)
		    {
		  	if(j%i == 0)
		  	{
		     	  count++;
		  	  break;
			}
		    }
		    if(count == 0 && j != 1 )
		    {
			System.out.println(j);;
		    }  
		  }
		
	}

}
