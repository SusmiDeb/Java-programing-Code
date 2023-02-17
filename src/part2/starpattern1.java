
package part2;

public class starpattern1 {
    public static void main(String[] args) {
        
         for(int i=1;i<=5;i++)//outer loop for row 
        {
           for(int j=1;j<=i;j++)//outer loop for column
           {
               System.out.print("*");
       
           }
          System.out.println(); 
        }
         
        for(int i=1;i<=4;i++)//outer loop for row 
        {
           for(int j=4;j>=i;j--)//outer loop for column
           {
               System.out.print("*");
       
           }
          System.out.println(); 
        }
         
    }
}


//Output:
//*       ***      *
//**      **       **
//***     *        ***
//                 **
//                 *