public class PrintStar2 {
    public static void main(String[] args) {
        int a[]={3,4,2,1};
        printS(a, a.length-1, 0);
        for (int i : a) {
            System.out.println(i);
        }
    }
    static void printS(int arr[],int i , int j,int largestElementIndex){
        if (i==0) {
            return;
        }
        if (i>j) {
            if (arr[j]>largestElementIndex) {
                largestElementIndex=j;
            }
            if () {
                
            }
            printS(arr,i, j+1);

        }
        else{
            printS(arr,i-1, 0);
        }
    }
    static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void printS2(int i , int j){
        if (i==0) {
            return;
        }
        if (i>j) {
            printS2(i, j+1);
            System.out.print("* ");
        }
        else{
            printS2(i-1, 0);
            System.out.println();
        }
    }
}
