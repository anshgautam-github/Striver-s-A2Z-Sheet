class Solution {
    public List<Integer> majorityElement(int[] arr) {
         int n = arr.length;

     int candidate1 = Integer.MIN_VALUE, candidate2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate1) {
                count1++;
            } else if (arr[i] == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = arr[i];
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = arr[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify the candidates by counting their occurrences
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate1) count1++;
            if (arr[i] == candidate2) count2++;
        }

        // Step 3: Add valid candidates to the result list
        List<Integer> result = new ArrayList<>();
        int threshold = n / 3;
        if (count1 > threshold) result.add(candidate1);
        if (count2 > threshold && candidate2 != candidate1) result.add(candidate2);

        return result;
    }
}
