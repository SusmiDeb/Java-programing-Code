
package part2;

public class starpattern2 {
    public static void main(String[] args) {
        
       ///upper traingle......
             for(int i=1;i<=4;i++)
                {
                    for(int j=4;j>=i;j--)
                    {
                        System.out.print("");  
                    }
                    for(int k=1;k<=i;k++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();   

                }
           //lower traingle......
             for(int i=1;i<=5;i++)
                {
                    for(int j=5;j>=i;j--)
                    {
                        System.out.print("*");  
                    }
                    for(int k=1;k<=i;k++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println();   

                }
    }

}




//output:

//   *      ***       *
//  **       **      **
// ***        *     ***
//                   **
//                    *