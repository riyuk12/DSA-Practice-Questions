package rajat;
public class isSorted {

    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        int max=Integer.MIN_VALUE;
        for(int a :arr){
            if(a>=max){
                max=a;
            }
            else{
                return false;
            }
        }
        return true;
    }
    
}
