package rajat;
class secMaxElement{
    int print2largest(int arr[], int n) {
        // code here
        int max=-1;
        int secmax=max;


        for(int i=0;i<n;i++){
            if(max<arr[i]){
                secmax=max;
                max=arr[i];
            }

            else if(secmax<arr[i] && arr[i]!=max){
                secmax=arr[i];
            }

        }
        
        return secmax;
        

    }
}