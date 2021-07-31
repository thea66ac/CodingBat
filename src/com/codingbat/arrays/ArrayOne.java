package com.codingbat.arrays;

import java.util.Arrays;

public class ArrayOne {
    public static void main(String[] args) {

    }

    /*Given an array of ints, return true if 6 appears as either the first or last element
    in the array. The array will be length 1 or more.

    firstLast6([1, 2, 6]) → true
    firstLast6([6, 1, 2, 3]) → true
    firstLast6([13, 6, 1, 2, 3]) → false*/
    public boolean firstLast6(int[] nums) {
        int firstElem = 0;
        int lastElem = 0;

        if (nums.length > 0) {
            firstElem = nums[0];
            lastElem = nums[nums.length - 1];
        }

        return firstElem == 6 || lastElem == 6;
    }

    /*Given an array of ints, return true if the array is length 1 or more, and the first element
    and the last element are equal.

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true*/
    public boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length - 1];
    }

    /*Return an int array containing the first x digits of pi, {3, 1, 4, ..., x}.

    makePi() → [3, 1, 4]*/
    public int[] makePi(int x) {
        String pi = String.valueOf(Math.PI).replace(".", "");

        int[] arr = new int[x];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(pi.charAt(i)));
        }

        return arr;
    }

    /*Given 2 arrays of ints, a and b, return true if they have the same first element or they
    have the same last element. Both arrays will be length 1 or more.

    commonEnd([1, 2, 3], [7, 3]) → true
    commonEnd([1, 2, 3], [7, 3, 2]) → false
    commonEnd([1, 2, 3], [1, 3]) → true*/
    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    /*Given an array of ints length 3, return the sum of all the elements.

    sum3([1, 2, 3]) → 6
    sum3([5, 11, 2]) → 18
    sum3([7, 0, 0]) → 7*/
    public int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        return sum;
    }

    /*Given an array of ints length 3, return an array with
    the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

    rotateLeft3([1, 2, 3]) → [2, 3, 1]
    rotateLeft3([5, 11, 9]) → [11, 9, 5]
    rotateLeft3([7, 0, 0]) → [0, 0, 7]*/
    public int[] rotateLeft3(int[] nums) {
        int tmp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            tmp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = tmp;
        }
        return nums;
    }

    /*Given an array of ints length 3, return a new array with the elements in reverse order, so
    {1, 2, 3} becomes {3, 2, 1}.

    reverse3([1, 2, 3]) → [3, 2, 1]
    reverse3([5, 11, 9]) → [9, 11, 5]
    reverse3([7, 0, 0]) → [0, 0, 7]*/
    public int[] reverse3(int[] nums) {
        int tmp = nums[0];
        nums[0] = nums[2];
        nums[2] = tmp;
        return nums;
    }

    /*Given an array of ints length 3, figure out which is larger, the first or last element in the
    array, and set all the other elements to be that value. Return the changed array.

    maxEnd3([1, 2, 3]) → [3, 3, 3]
    maxEnd3([11, 5, 9]) → [11, 11, 11]
    maxEnd3([2, 11, 3]) → [3, 3, 3]*/
    public int[] maxEnd3(int[] nums) {
        int firstElem = nums[0];
        int lastElem = nums[nums.length - 1];
        int largest = Math.max(firstElem, lastElem);
        Arrays.fill(nums, largest);
        return nums;
    }

    /*Given an array of ints, return the sum of the first 2 elements in the array. If the array
    length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

    sum2([1, 2, 3]) → 3
    sum2([1, 1]) → 2
    sum2([1, 1, 1, 1]) → 2*/
    public int sum2(int[] nums) {
        return switch (nums.length) {
            case 0 -> 0;
            case 1 -> nums[0];
            default -> nums[0] + nums[1];
        };
    }
}
