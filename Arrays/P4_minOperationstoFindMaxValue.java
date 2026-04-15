class Solution {
    public int countNonMinimum(int[] nums) {
        // write your code here 
        int n = nums.length;
        
        // 1 . find min value
        int min = nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        //2 .Count how many elemets are already equal to min
        int count =0;
        for(int i=0;i<n;i++){
            if(nums[i] == min){
                count++;
            }
        }
        // elemets to change = total - elements equal to min
        return n - count;
    }
}
