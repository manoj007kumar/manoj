import java.util.*;
public class Prim {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to check its prime or not");
		int n=sc.nextInt();
		if(n==1||n==2||n==3)
		{
			System.out.println("prime");
		}
		else if(n>3)
		{
			if(n%2==0||n%3==0)
			{
				System.out.println("not a prime");
			}
			else
			{
				System.out.println("prime");
			}
		}
                       sc.close();
	}	

}