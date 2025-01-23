//Bruteforce




//OPTIMAL
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum>=0){
                sum+=nums[i];
            }else{
                sum=nums[i];
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}

// //FOLLOW UP->>
// There might be more than one subarray with the maximum sum. We need to print any of them.

public int[] maxSubArray(int[] nums) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum >= 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
                tempStart = i; // Start a new subarray
            }

            if (sum > ans) {
                ans = sum;
                start = tempStart; // Update the start of the maximum subarray
                end = i;           // Update the end of the maximum subarray
            }
        }

        // Extract the subarray with the maximum sum
        int[] resultSubarray = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            resultSubarray[i - start] = nums[i];
        }
        return resultSubarray; 

      // if reutrn type -> void -> then print instreas of returnign
    // Print the subarray with the maximum sum
        // System.out.print("Maximum subarray: ");
        // for (int i = start; i <= end; i++) {
        //     System.out.print(nums[i] + " ");
        // }
        // System.out.println();
  
    }
