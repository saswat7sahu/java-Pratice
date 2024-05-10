public class ReverseArray1 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,2,4,6};
        for (int i = 0; i < a.length/2; i++) {
            swap(a, i, (a.length-i)-1);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
    static void swap(int arr[],int e,int f){
        int x=arr[e];
        arr[e]=arr[f];
        arr[f]=x;
    }
}
