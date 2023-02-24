package Java.DataStructures.HashTables;

// given an array, identify and return the first recurring character/number

import java.util.HashMap;

public class FirstRecurringCharacter {

    public static void main(String[] args) {
        int[] numbers = {2, 5, 1, 2, 3, 4, 1, 2, 4};
        int firstRecurringCharacter = findFirstRecurringCharacter(numbers);
        System.out.println("First recurring character is " + firstRecurringCharacter);
    }

    public static int findFirstRecurringCharacter(int[] numbers) {
        HashMap<Integer, String> recurNumbers = new HashMap<Integer, String>();
        for (int i = 0; i < numbers.length; i++) {
            if (!recurNumbers.containsKey(numbers[i])) {
                recurNumbers.put(numbers[i], "true");
            } else {
                return numbers[i];
            }
        }
        return -1;
    }

}
