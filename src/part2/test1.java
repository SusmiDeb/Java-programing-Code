
package part2;


public class test1 {
    public static void main(String[] args) {
        
        int n=10;
       for(int i=n;i>=2;i--)
       {
           for(int j=1;j<=i-1;j++)
           {
               System.out.print(" ");
           }
           System.out.println("*");
       }
      System.out.println("************************");
        
       for(int i=1;i<=n-1;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print(" ");
           }
           System.out.println("*");
       }
    }
    
}
