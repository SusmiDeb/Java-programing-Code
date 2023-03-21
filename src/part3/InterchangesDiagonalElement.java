//Java program to interchanges the Diagonal of a 2-D array

package part3;

import java.util.Scanner;

public class InterchangesDiagonalElement {
    public static void main(String[] args) {
        int temp;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number od rows , column in matrix:");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        //Input the 2-D Array;
        System.out.println("Enter all the elements of matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                
            }
         
        }
        
        //Print the 2-D Array;
        System.out.println("Complete n*n matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        
        //Swaping the Diagonal 
        for(int i=0;i<n;i++)
        {
            temp=a[i][i];
            a[i][i]=a[i][n-i-1];
            a[i][n-i-1]=temp;
        }
        
        
        //print Swap /Interchanges Diagonal 2-D Array;
        System.out.println("Matrix After Interchanges Diagonal :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {   
                
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    
    }
         
    
    
}
