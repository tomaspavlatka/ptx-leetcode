package cz.pavlatka.leetcode.solutions;

import java.util.Arrays;

public class MaxTastinessOfCandyBasket {
    // Time: O (n log R)
    // Space: O(1)
    public int bruteForce(int[] price, int k) {
        Arrays.sort(price); // O (n log n)

        var max = 0;
        var low = 0;
        var high = price[price.length - 1] - price[0];

        while (low <= high) { // O (log R) - r is space between prices
            var mid = low + (high - low) / 2;
            if (possible(price, k, mid)) { // O (n)
                max = mid;
                low = mid+1;
            } else {
                high = mid - 1;
            }
        }

        return max;
    }

    private boolean possible(int[] price, int k, int taste) {
        var curr = price[0];
        var cnt = 1;

        for (int i = 1; i < price.length; i++) {
            if (price[i] - curr >= taste) {
                curr = price[i];
                cnt++;
            }
        }

        return cnt >= k;
    }
}

