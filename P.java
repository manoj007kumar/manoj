class P
{
   public static void main(String[] args)
    {
       int i=21;
       boolean flag=false;
       for(int j=2;j<=i/2;j++)
        {
           if(i%j==0)
            {
               flag=true;
               break;
            }
         }
          if(flag)
          {
             System.out.print("not a prime");
          }
         else
          {
             System.out.print("prime");
          }
     }
}