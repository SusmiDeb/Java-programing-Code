
package part3;

import java.util.Scanner;

public class FindSumOFArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many element you want:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter individual aray input:");
             ar[i]=sc.nextInt();
            
        }
        for(int i=0;i<n;i++)
        {
             System.out.print(ar[i]+" ");
        }
        
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+ar[i];
        }
        System.out.println("\nSum of the array:"+sum);
    }
}




