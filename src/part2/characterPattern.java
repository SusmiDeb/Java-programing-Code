
package part2;

public class characterPattern {
    public static void main(String[] args) {
        
        // A
        // AA
        // AAA
        char ch='A';
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            
            System.out.println(" ");
        }
        
        // A
        // BB
        // CCC
        
        
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            
            System.out.println(" ");
            ch++;
        }
        
        // A
        // AB
        // ABC
        
        for(int i=1;i<=5;i++)
        {
            ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            
            System.out.println(" ");
            
        }
          
        
        //A
        //BC
        //DEF
         //int ch='A';
         for(int i=1;i<=5;i++)
        {
           
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            
            System.out.println(" ");
            
        }
          
        
        
        
        
    }
}
