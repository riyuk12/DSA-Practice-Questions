package rajat;

class maxElement {
    
    public int largest(int arr[], int n)
    {
        int max = arr[0];

        for(int a:arr){
            if(a>max){
                max=a;
            }
        }

        return max;
    }
}