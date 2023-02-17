
package Part1;

import java.util.Scanner;

public class countEvenOdd {
    public static void main(String[] args) {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter how many element are you want?");
         int n=sc.nextInt();
         int []arr=new int[n];
         int even=0,odd=0;
         System.out.println("Enter"+n+"values");
         for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         }
          for(int i=0;i<arr.length;i++){
              if(arr[i]%2==0){
                  System.out.println(arr[i]+"Is Even");
                  even++;
                  
              }
              else{
                 System.out.println(arr[i]+"Is Odd"); 
                 odd++;
              }
          }
          System.out.println("Even count are "+even+"\n odd count are "+odd);
         
    }
    
}
