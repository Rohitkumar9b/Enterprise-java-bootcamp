
public class third_ques_of_Ist_assign {

	public static void main(String[] args) {
		int n=14;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) //question no 3 in assignment-1
			{
				if(i==0 ||i==n-1 ||j==0 || j==n-1 || i+j<=(n-1)/2 ||j-i>=(n-1)/2 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) //question no 4 in assignment-1
			{
				if(i==n-1|| i-j>=(n-1)/2 ||i+j>=n-1+(n-1)/2 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) //question no 5 in assignment-1
			{
				if(i==n-1||i==0 ||j==0 || i-j>=(n-1)/2 || i+j<=(n-1)/2 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
