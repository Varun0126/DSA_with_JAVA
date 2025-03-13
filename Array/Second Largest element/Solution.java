class Solution {
    static int secondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) return -1; // If array has less than 2 elements, no second largest exists.

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest; // Update second largest before updating largest
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num; // Update second largest if num is between largest and second largest
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest(arr1)); // Output: 34

        int[] arr2 = {10, 5, 10};
        System.out.println(secondLargest(arr2)); // Output: 5

        int[] arr3 = {10, 10, 10};
        System.out.println(secondLargest(arr3)); // Output: -1
    }
}
