public class SortedOrN {
    public static void main(String[] args) {
        int a[]={3,4,5,678,34444444,9};
        System.out.println(a.length);
        for (int i = 0; i < a.length-1; i++) {
            if (!a[i]>a[i+1]) {
                break;
            }
            
        }
    }
}
