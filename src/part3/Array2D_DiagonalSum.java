//Write a program to input a Square Matrix and print the sum of left and right diagonal element 
package part3;

import java.util.Scanner;

public class Array2D_DiagonalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           System.out.println("Enter row for the array:");
        int row=sc.nextInt();
        System.out.println("Enter column for the array:");
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        //input array elements
        System.out.println("Enter"+(row*col)+"Array Elements:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        //Print the array elements:
        System.out.println("The Array is:\n");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               
                System.out.print(a[i][j]+" ");
            }
            
            System.out.println();
        }
        
        int sumL=0,sumR=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               if(i==j)
               {
                   sumL=sumL+a[i][j];
               }
               if(i+j==col-1)
               {
                  sumR=sumR+a[i][j];
               }
            }
            
        }
        System.out.println("Sum of the Diagonal elements:");
        System.out.println("Sum of the left diagonal:"+sumL);
        System.out.println("Sum of the Right diagonal:"+sumR);
        
    }
  
}
