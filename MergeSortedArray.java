
public class MergeSortedArray {
    public void mergeSortedArray (int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        if (m + n == 1)
        {
            if (m == 0)
                nums1[0] = nums2[0];
        }
        else
        {
            while(i < m)
            {
                if (nums1[i] == 0)
                {
                    int min = Math.max(nums1[i], nums2[j]);
                    nums1[i] = min;
                    i++;
                    j++;
                }
                else
                {
                    int min = Math.min(nums1[i], nums2[j]);
                    if (min == nums1[i])
                    {
                        i++;
                    }
                    else
                    {
                        nums1[i] = min;
                        i++;
                        j++;
                    }
                }
            }
        }
    }
}
