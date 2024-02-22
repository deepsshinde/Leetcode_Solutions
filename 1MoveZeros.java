class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0; //count of non zero elements
        int i;
        for(i=0; i<nums.length; i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;

                count++;
            }
        }

        for(i=0; i<nums.length; i++)
        {
            System.out.println(nums[i] +"  ");
        }
    }
}
