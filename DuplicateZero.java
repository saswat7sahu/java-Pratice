public class DuplicateZero {
    public static void main(String[] args) {
        int arr[]={1,0,2,4,5,6,0,8};
        int i=0;
        while(i<arr.length-1){
             if(arr[i]==0){
                for(int j=arr.length-1;j>=i+1;j--){
                    arr[j]=arr[j-1];
                }
                
                i+=2;
            }else{
                 i++;
             }
        }
    }
}
