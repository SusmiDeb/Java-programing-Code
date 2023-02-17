package Part1;

import java.util.Scanner;

public class AverageOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterhow many element you want ?");
        int n = sc.nextInt();
        double[] arr = new double[n];
        System.out.println("Enter" + n + "element in an array");
        double sum=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum+=arr[i];
        }
        double av=sum/n;
        System.out.println("Average value is:"+av);

    }

}
