package Java.DataStructures.Arrays;

// given 2 sorted arrays, merge 2 arrays into 1 sorted array
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {0, 3, 4, 31};
        int[] arr2 = {4, 6, 30};
        int[] mergedArray = mergeTwoSortedArrays(arr1, arr2);
        for (int number : mergedArray) {
            System.out.println(number);
        }
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (j != arr1.length && (k == arr2.length || arr1[j] < arr2[k])) {
                mergedArray[i] = arr1[j];
                j++;
            } else {
                mergedArray[i] = arr2[k];
                k++;
            }
//            Character.isLetterOrDigit()
        }

        return mergedArray;
    }

    ;
}
