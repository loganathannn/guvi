  import java.util.*;  
    public class Arms
{
  public static void main(String[] args) 
  {
    int  count = 0, a, b, c, sum = 0;
      Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();            
       int m=sc.nextInt();
    for(int i = n; i <=m; i++)
    {
      n = i;
      while(n > 0)
            {
        
        b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
              }
      
      if(sum == i)
      
      {
        
        System.out.print(i+" ");
        
      }
      
      sum = 0;
      
    }
    
  }
  
}
