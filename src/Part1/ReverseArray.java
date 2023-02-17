package Part1;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element you want?");
        int n = sc.nextInt();
        int[] elt = new int[n];
        for (int i = 0; i < n; i++) {
             System.out.println("Enter array element"+(i+1));
             elt[i]=sc.nextInt();
             
        }
        System.out.println("Original element are:");
        for (int i = 0; i < n; i++){
            System.out.println(elt[i]+"");
        }
         System.out.println("Reverse element are:");
        for (int i =n-1; i>=0; i--){
            System.out.println(elt[i]+"");
        }
    }
}
