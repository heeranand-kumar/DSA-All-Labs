
package laab01;

import java.util.Arrays;

public class Lab01Tasks {

    public static void main(String[] args) {
        // Task 01: Array Basics and Traversal
        System.out.println("Task 01: Array Basics and Traversal");
        arrayBasicsAndTraversal();

        // Task 02: Insertion in Arrays
        System.out.println("\nTask 02: Insertion in Arrays");
        insertionInArrays();

        // Task 03: Deletion in Arrays
        System.out.println("\nTask 03: Deletion in Arrays");
        deletionInArrays();

        // Task 04: Searching in Arrays
        System.out.println("\nTask 04: Searching in Arrays");
        searchingInArrays();

        // Task 05: Reverse Array
        System.out.println("\nTask 05: Reverse Array");
        reverseArray();

        // Task 06: Palindrome Check
        System.out.println("\nTask 06: Palindrome Check");
        palindromeCheck();

        // Task 07: Anagram Check
        System.out.println("\nTask 07: Anagram Check");
        anagramCheck();
    }

    // Task 01: Array Basics and Traversal
    public static void arrayBasicsAndTraversal() {
        int[] array = {5, 15, 25, 35, 45, 55};

        // Print all elements
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print each element with its index
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
    }

    // Task 02: Insertion in Arrays
    public static void insertionInArrays() {
        int[] array1 = {12, 24, 36, 48, 60};
        System.out.println("After inserting at start: " + Arrays.toString(insertAtPosition(array1, 6, 0)));

        int[] array2 = {100, 200, 300, 400, 500};
        System.out.println("After inserting in middle: " + Arrays.toString(insertAtPosition(array2, 250, 2)));

        int[] array3 = {3, 6, 9, 12, 15};
        System.out.println("After inserting at end: " + Arrays.toString(insertAtPosition(array3, 18, array3.length)));
    }

    public static int[] insertAtPosition(int[] array, int value, int position) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = value;
            } else {
                newArray[i] = array[j++];
            }
        }
        return newArray;
    }

    // Task 03: Deletion in Arrays
    public static void deletionInArrays() {
        int[] array = {8, 16, 24, 32, 40};
        System.out.println("After deletion: " + Arrays.toString(deleteAtIndex(array, 2)));
    }

    public static int[] deleteAtIndex(int[] array, int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }

    // Task 04: Searching in Arrays
    public static void searchingInArrays() {
        int[] array1 = {13, 26, 39, 52, 65};
        System.out.println("Element at index 4: " + array1[4]);

        int[] array2 = {4, 6, 2, 8, 10};
        linearSearch(array2, 8);

        int[] array3 = {11, 22, 33, 44, 55};
        binarySearch(array3, 33);
    }

    public static void linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("Element " + value + " found at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public static void binarySearch(int[] array, int value) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == value) {
                System.out.println("Element " + value + " found at index " + mid);
                return;
            } else if (array[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Element not found");
    }

    // Task 05: Reverse Array
    public static void reverseArray() {
        int[] array = {1, 3, 5, 7, 9};
        System.out.println("Reversed Array: " + Arrays.toString(reverse(array)));
    }

    public static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // Task 06: Palindrome Check
    public static void palindromeCheck() {
        String str = "radar";
        System.out.println(isPalindrome(str) ? "Palindrome" : "Not Palindrome");
    }

    public static boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            if (chars[left++] != chars[right--]) {
                return false;
            }
        }
        return true;
    }

    // Task 07: Anagram Check
    public static void anagramCheck() {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(areAnagrams(str1, str2) ? "Anagram" : "Not Anagram");
    }

    public static boolean areAnagrams(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}
