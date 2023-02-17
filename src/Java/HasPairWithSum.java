package Java;
//google interview question
//given an array of numbers, determine if the array has a pair of numbers that can add up to a given sum

import java.sql.SQLOutput;
import java.util.HashMap;

public class HasPairWithSum {

    public static void main(String[] args) {
        Integer[] arr = {7, 3, 2, 5, 9};
        int sum = 9;

        boolean result = hasPairWithSum(arr, sum);
        if (result) {
            System.out.println("This array has a pair of numbers that add up to " + sum);
        } else {
            System.out.println("This array does not has a pair of numbers that add up to " + sum);
        }

    }

    public static boolean hasPairWithSum(Integer[] arr, int sum) {
        HashMap<Integer, String> mapNumbers = new HashMap<Integer, String>();
        for (int i = 0; i < arr.length; i++) {
            if (!mapNumbers.containsKey(arr[i])) {
                mapNumbers.put((sum - arr[i]), "true");
            } else {
                return true;
            }
        }
        return false;
    }
}


