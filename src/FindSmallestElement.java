public class FindSmallestElement {
    public static int findSmallestElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        if (nums == null || nums.length == 0)
        {
            return 0;
        }

        else if (nums.length > 0)
        {
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] < min)
                {
                    min = nums[i];
                }
            }
        }
        return min;
    }
}