//Brute Force

class Solution {
    public int removeDuplicates(int[] arr) {
   

     Set < Integer > set = new TreeSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
}}


//OPTIMAL 

class Solution {
    public int removeDuplicates(int[] arr) {
        
     int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
            
        }
        return i+1;
}}


