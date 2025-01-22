//Brute Force

// Time Complexity: O(N^2)
// Space Complexity: O(1)

class Solution {
  static boolean isSorted(int arr[], int n) {

      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
            if(arr[j]<arr[i]){
                return false;
            }
          }
          return true;
      }
    
  }


// Approach: Efficient (Single traversal)

class Solution {
  static boolean isSorted(int arr[], int n) {

    for(int i=0; i<n; i++){
        if(arr[i]<arr[i-1]){
            return false;
        }
    }
    return true;
    
  }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
