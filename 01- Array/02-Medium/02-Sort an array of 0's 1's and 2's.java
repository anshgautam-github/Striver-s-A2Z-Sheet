//BRUTEFORCE
public static void sortArray(int[] num, int n) {
    int cnt0 = 0, cnt1 = 0, cnt2 = 0;

    // Count occurrences of 0, 1, and 2
    for (int i = 0; i < n; i++) {
        if (num[i] == 0) cnt0++;
        else if (num[i] == 1) cnt1++;
        else cnt2++;
    }

    // Replace the values in the original array
    for (int i = 0; i < cnt0; i++) num[i] = 0; // Fill 0's

    for (int i = cnt0; i < cnt0 + cnt1; i++) num[i] = 1; // Fill 1's

    for (int i = cnt0 + cnt1; i < n; i++) num[i] = 2; // Fill 2's
}




//OPTIMIZED 

class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}
