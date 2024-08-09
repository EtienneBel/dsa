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

    @Test
    public void testCountPairs() {
        List<Integer> nums = Arrays.asList(-6, 2, 5, -2, -7, -1, 3);
        assertEquals(10, countPairs(nums, -2));
    }
}
