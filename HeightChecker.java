public class HeightChecker {
    public static void main(String[] args) {
        int heights[]={1,1,4,2,1,3};
        int expected[]=new int[heights.length];
       
        int k=0;
        int arr[]=new int[101];
        for (int i:heights){
            arr[i]+=1;
        }
        for(int i=1;i<arr.length;i++){
            int c=arr[i];
            for (int j=1;j<=c;j++){
                expected[k]=i;
                k+=1;
            }
        }
        int mm=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                mm+=1;
            }
        }
        System.out.println("the indexces didn't mismatch is"+mm);
    }

}
