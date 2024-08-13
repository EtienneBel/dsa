package src;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountPairs {

    public int countPairs(List<Integer> nums, int target) {
        int arrayLength = nums.size();
        int numberOfPairs = 0;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                int sum = nums.get(i) + nums.get(j);
                if (sum < target) {
                    numberOfPairs += 1;
                }
            }
        }
        return numberOfPairs;
    }

    // Optimized Approach with Binary Search
    public int countPairsUsingBinarySearch(List<Integer> nums, int target) {
        Collections.sort(nums);  // Sort the list to use the two-pointer technique
        int left = 0;
        int right = nums.size() - 1;
        int ans = 0;

        while (left < right) {  // Use < to avoid infinite loop or over-counting
            if (nums.get(left) + nums.get(right) < target) {
                ans += right - left;  // All pairs from left to right are valid
                left++;  // Move left pointer to the right to consider new pairs
            } else {
                right--;  // Move right pointer to the left to find a valid pair
            }
        }
        return ans;  // Return the total count of valid pairs
    }

    @Test
    public void testCountPairs() {
        List<Integer> nums = Arrays.asList(-6, 2, 5, -2, -7, -1, 3);
        assertEquals(10, countPairs(nums, -2));
//        assertEquals(10, countPairsUsingBinarySearch(nums, -2));
    }
}
