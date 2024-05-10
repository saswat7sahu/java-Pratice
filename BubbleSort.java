public class BubbleSort {
    public static void main(String[] args) {
        int a[]={4,3,2,1};
        sort(a); 
        for (int i : a) {
            System.out.println(i);
        }
    }
    static void sort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }
    static void swap(int a[],int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;


    }

}