class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                smax = max;
                max = num;
            } else if (num > smax) {
                smax = num;
            }
        }

        return (max - 1) * (smax - 1);
    }
}