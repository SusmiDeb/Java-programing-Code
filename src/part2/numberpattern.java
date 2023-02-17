
package part2;

public class numberpattern {
    public static void main(String[] args) {
        //1
        //22   this print i value
        //333
       
        for(int i=1; i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+"");    
            }
         
            System.out.println();
        }
        
        
      //1
      //12  this print j value
      //123
      
      for(int i=1; i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"");    
            }
         
            System.out.println();
        }
      
      //1
      //23
      //456
      int count=1;
      for(int i=1; i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+"");  
                count++;
            }
         
            System.out.println();
        }
      
      
      //   1
      //  22
      // 333
      
      for(int i=1; i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");  
                
            }
         
            for(int k=1;k<=i;k++)
            {
                System.out.print(i+"");  
                
            }
            System.out.println();
        }
      
       //   1
       //  12
       // 123
       
        for(int i=1; i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");  
                
            }
         
            for(int k=1;k<=i;k++)
            {
                System.out.print(k+"");  
                
            }
            System.out.println();
        } 
      
        //  1
        // 23
        //345
       int cou=1;
       for(int i=1; i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");  
                
            }
         
            for(int k=1;k<=i;k++)
            {
                System.out.print(cou+"");
                cou++;
                
            }
            System.out.println();
        } 
       
        
    }
}
