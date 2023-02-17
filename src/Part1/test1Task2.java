
package Part1;
public class test1Task2 {
    public static void main(String[] args) {
        int [] ar={5, -5, 10, -10, -15, 15};
        linearSearch(ar,11);
    }
    static void linearSearch(int ar[],int target){
        int closest=0;
         for(int i=0;i<ar.length;i++){
             if(ar[i]==target){
                 
                 System.out.println(target+"Fonud"+i);
                 break;
             }
            
             int d1=Math.abs(ar[i]-target);
             System.out.println("D1::::"+d1);
             int d2=Math.abs(closest-target);
             System.out.println("D2:::"+d2);
             if(d1<d2)
                 closest=ar[i];
         }
         System.out.println(closest);
        
    }
}
