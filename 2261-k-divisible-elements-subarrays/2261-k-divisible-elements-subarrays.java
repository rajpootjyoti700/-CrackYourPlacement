class Solution {
    public int countDistinct(int[] nums, int k, int p) {
         Set<String> distinctSubarrays = new HashSet<>();
        int n = nums.length;

        // Generate all subarrays
        for (int i = 0; i < n; i++) {
            int countDivisible = 0;
            StringBuilder subarray = new StringBuilder();

            // Build subarray and count elements divisible by p
            for (int j = i; j < n; j++) {
                if (nums[j] % p == 0) {
                    countDivisible++;
                }
                if (countDivisible > k) {
                    break; // No need to consider further if divisible count exceeds k
                }
                subarray.append(nums[j]).append(",");
                distinctSubarrays.add(subarray.toString());
            }
        }

        return distinctSubarrays.size();
    


    }
}