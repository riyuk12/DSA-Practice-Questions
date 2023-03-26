package Harsh.Arrays;

public class LargestElement {
    public int largest(int arr[], int n)
    {
        int min = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min) min = arr[i];
        }
        return min;
    }
}
