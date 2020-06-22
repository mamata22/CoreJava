import java.util.Arrays;

public class Pattern {

	public static void main(String[] args)
	{
		int n=4;
	   int[][] ia=new int[n][n];
	
			   
			   
	   int lb=n-1; 
	   int ub=0;
	   int val=0;
	   int ro=n-2;
	   int i=0,j=0;
	   while(ro>0)
	   {
		   while(j<=lb)
		   {
			    ia[i][j++]=val;
		   }
		   j--;
		   while(i<=lb)
		   {
			   ia[i++][j]=val; 
		   }
		   i--;
		   while(j>=ub)
		   {
			   ia[i][j--]=val;
		   }
		   j++; 
		   while(i>=ub)
		   {
			   ia[i--][j]=val;
		   }
		   i++;
		   ro--;
		   val++;
		   lb--;
		   ub++;
		   i++;
		   j++;
	   }

	   System.out.println("GGGGG");
	   for(int[] a:ia)
		   System.out.println(Arrays.toString(a));
	}

}
