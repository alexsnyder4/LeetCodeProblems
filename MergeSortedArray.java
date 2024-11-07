/*
    88. Merge Sorted Array

    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

    Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

    

    Example 1:

    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    Example 2:

    Input: nums1 = [1], m = 1, nums2 = [], n = 0
    Output: [1]
    Explanation: The arrays we are merging are [1] and [].
    The result of the merge is [1].
    Example 3:

    Input: nums1 = [0], m = 0, nums2 = [1], n = 1
    Output: [1]
    Explanation: The arrays we are merging are [] and [1].
    The result of the merge is [1].
    Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
    

    Constraints:

    nums1.length == m + n
    nums2.length == n
    0 <= m, n <= 200
    1 <= m + n <= 200
    -109 <= nums1[i], nums2[j] <= 109
 */

 // Look at the last consecutive number in each array and find the largest number and put it at the back of arr1.
 // This is similar methodology to taking a pizza pie with 3/4 remaining and taking a slice from one side and putting on the other side over and over, you will never collapse on yourself.
 // In more technical terms by starting at the back we can ensure that no elements are overwritten prematurely.
 
public class MergeSortedArray {
    public void mergeSortedArray (int[] nums1, int m, int[] nums2, int n) {
         // Start from the end of both arrays
         int i = m - 1; // Index of the last element in arr1's original part
         int j = n - 1; // Index of the last element in arr2
         int k = m + n - 1; // Index of the last position in arr1
 
         // Merge arr2 into arr1, starting from the end
         while (i >= 0 && j >= 0) {
             if (nums1[i] > nums2[j]) {
                 nums1[k--] = nums1[i--];
             } else {
                 nums1[k--] = nums2[j--];
             }
         }
 
         // If there are remaining elements in arr2, copy them
         while (j >= 0) {
             nums1[k--] = nums2[j--];
         }
    }
}
