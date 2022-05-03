package leetcode.arrays;

import java.util.Arrays;

public class MaxProfit {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(nums);
        System.out.println("maxProfit: " + maxProfit + ", nums = " + Arrays.toString(nums));
    }

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
