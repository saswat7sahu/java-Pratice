/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n */
public class MergeArray {
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int  nums2[]={2,5,6};
        int m=3,n=3;
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
        }else{
          m--;
         n--;
          int last=m+n+1;
        while(m>=0 && n>=0){
         if (nums1[m]>nums2[n]) {
             nums1[last]=nums1[m];
             m--;
         }else{
             nums1[last]=nums2[n];
             n--;
         }
         last--;
        }
           while(n>=0){
               nums1[last]=nums2[n];
               n--;
               last--;
           }
        }
        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
