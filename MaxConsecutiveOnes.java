class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0; 
        int maxCount = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 1)
            {
                currentCount++;
            }
            else
            {
                maxCount = Math.max(currentCount, maxCount);
                currentCount = 0;
            }
            
        }
        maxCount = Math.max(currentCount, maxCount);
        return maxCount;
    }
    public static void main(String[] args)
    {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
