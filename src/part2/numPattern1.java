
package part2;


public class numPattern1 {
    public static void main(String[] args) {
        int n=12;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n ;j++)
            {
                System.out.print("");
            }
         System.out.print("F");
        }
        System.out.println();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n ;j++)
            {
                System.out.print("");
            }
         System.out.print("F");
        }
        System.out.println("");
        for(int i=1;i<=n/3;i++)
        {
            for(int j=1;j<=1 ;j++)
            {
                System.out.print("F");
            }
         System.out.println("");
        }
       
    }
}
