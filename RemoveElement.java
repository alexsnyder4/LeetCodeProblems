public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int i = 0;
        int j = nums.length - 1;

        while (i < j)
        {
            if(nums[i] == val && nums[j] == val)
            {
                j--;
            }
            else if (nums[i] == val && nums[j] != val)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
                k++;
            }
            else if(nums[i] != val && nums[j] == val)
            {
                i++;
                j--;
                k++;
            }
            else
            {
                i++;
                k++;
            }        
        }
        if (i == j)
        {
            if (nums[i] != val)
            {
                k++;
            }
        }
        return k;
    }
}
