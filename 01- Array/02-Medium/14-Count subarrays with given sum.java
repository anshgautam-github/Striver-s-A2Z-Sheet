class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 

        int n = arr.length;
        int[] psum = new int[n]; 
        psum[0] = arr[0]; 
        
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i - 1] + arr[i];
        }
        
        int ans = 0; // Count of subarrays
        
        for (int ep = 0; ep < n; ep++) {
            int diff = psum[ep] - k; 
            
            ans += map.getOrDefault(diff, 0); 
            map.put(psum[ep], map.getOrDefault(psum[ep], 0) + 1);
        }
        
        return ans; 
    }
}
