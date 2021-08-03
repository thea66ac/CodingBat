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

    /*Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

    middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
    middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
    middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]*/
    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    /*Given an array of ints, return a new array length 2 containing the first and last elements
    from the original array. The original array will be length 1 or more.

    makeEnds([1, 2, 3]) → [1, 3]
    makeEnds([1, 2, 3, 4]) → [1, 4]
    makeEnds([7, 4, 6, 2]) → [7, 2]*/
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    /*Given an int array length 2, return true if it contains a 2 or a 3.

    has23([2, 5]) → true
    has23([4, 3]) → true
    has23([4, 5]) → false*/
    public boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2 || nums[i] == 3)
                return true;
        return false;
    }

    /*Given an int array length 2, return true if it does not contain a 2 or 3.

    no23([4, 5]) → true
    no23([4, 2]) → false
    no23([3, 5]) → false*/
    public boolean no23(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2 || nums[i] == 3)
                return false;
        return true;
    }

    /*Given an int array, return a new array with double the length where its last element is the
    same as the original array, and all the other elements are 0. The original array will be
    length 1 or more. Note: by default, a new int array contains all 0's.

    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    makeLast([1, 2]) → [0, 0, 0, 2]
    makeLast([3]) → [0, 3]*/
    public int[] makeLast(int[] nums) {
        int[] arr = new int[nums.length * 2];
        arr[arr.length - 1] = nums[nums.length - 1];
        return arr;
    }

    /*Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

    double23([2, 2]) → true
    double23([3, 3]) → true
    double23([2, 3]) → false*/
    public boolean double23(int[] nums) {
        if (nums.length < 2) return false;
        int a = nums[0];
        int b = nums[1];
        return a == b && (a == 2 || a == 3);
    }

    /*Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the
    3 element to 0. Return the changed array.

    fix23([1, 2, 3]) → [1, 2, 0]
    fix23([2, 3, 5]) → [2, 0, 5]
    fix23([1, 2, 1]) → [1, 2, 1]*/
    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == 2 && nums[i + 1] == 3)
                nums[i + 1] = 0;
        return nums;
    }

    /*Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as
    their first element.

    start1([1, 2, 3], [1, 3]) → 2
    start1([7, 2, 3], [1]) → 1
    start1([1, 2], []) → 1*/
    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) count++;
        if (b.length > 0 && b[0] == 1) count++;
        return count;
    }

    /*Start with 2 int arrays, a and b, each length 2. Consider the sum of the values
    in each array. Return the array which has the largest sum. In event of a tie, return a.

    biggerTwo([1, 2], [3, 4]) → [3, 4]
    biggerTwo([3, 4], [1, 2]) → [3, 4]
    biggerTwo([1, 1], [1, 2]) → [1, 2]*/
    public int[] biggerTwo(int[] a, int[] b) {
        int aSum = a[0] + a[1];
        int bSum = b[0] + b[1];
        return aSum >= bSum ? a : b;
    }
}
