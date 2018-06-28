import java.util.*;
class Prime
{
   public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number the to check its prime or not :");
        int i=s.nextInt();
        for(int n=2;n<=i/2;n++)
         {
        if(i%n==0)
         {
              System.out.println("not a prime");
              break;
         }
           else 
            {
             System.out.println("prime");
             break;
            }
         }
           s.close();
     }
}

        