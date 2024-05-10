//find start and last element
// brute force approach
public class findFirstLastpos {
    public static void main(String[] args) {
        int a[]={5,,7,7,8,8,10};
        System.out.println(findfl(a, 7));
    }
    static int[] findfl(int arr[],int target){
        s=0,e=arr.length-1;
        while (s<arr.length) {
            if (arr[s]==target) {
                break;
            }
            s++;
        }
        while (e>0) {
            if (arr[e]==target) {
                break;
            }
            e--;
        }
        return new int[]{s,e};
    }
}
