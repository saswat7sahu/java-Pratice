public class Srsa {
    public static void main(String[] args) {
        int arr={7,8,1,2,3,4,5,6};
        System.out.println(findIndex(arr,8));;
    }
    static int findIndex(int a[],int t){
        int s=0,e=a.length-1;
        while (s<e) {
            m=s+(e-s)/2;
            if (a[m]==t) {
                return m;
            }
            else if (a[m]<=t<=a[e]) {
              return  binarys(a, t, m+1, e);
            }
            else{
               return binarys(a, t, s, mid-1);
            }
        }
        return -1;
    }
    static int binarys(int s[],int t,int s,int e){
        while (s<e) {
            int m=s+(e-s)/2;
            if (a[m]==t) {
                return m;
            }
            else if (a[m]>t) {
                e=m-1;
            }
            else{
                s=mid+1;
            }
        }
    }
}
