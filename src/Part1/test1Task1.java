package Part1;

public class test1Task1 {

    public static void main(String[] args) {
        int[] ar = {5, -5, 10, -10, -15, 15};
        plusminusAverage(ar);
    }

    static void plusminusAverage(int... ar) {
        int msum = 0, psum = 0, mit = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 0) {
                msum += ar[i];
                mit++;
            } else {
                psum += ar[i];
                  
            }
          
        }
        System.out.println(msum / mit);
        System.out.println(psum /(ar.length-mit));

    }
}
