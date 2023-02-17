package Java.Arrays;

import java.util.HashMap;

// given an array of integers num, and an integer target, return indices of the two numbers such that they add up to target
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] twoSum = findTwoSum(nums, target);
        for (int num : twoSum) {
            System.out.println(num);
        }

    }

    public static int[] findTwoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        HashMap<Integer, Integer> mapNumbers = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!mapNumbers.containsKey(nums[i])) {
                mapNumbers.put((target - nums[i]), (target - nums[i]));
            } else {
                System.out.println("two Sum pair has been found!");
                twoSum[0] = mapNumbers.get(nums[i]);
                twoSum[1] = target - nums[i];
            }
        }
        return twoSum;
    }

}
