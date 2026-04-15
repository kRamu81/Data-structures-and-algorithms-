class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] > nums[(i + 1) % n]){
                count++;
            }
        }

        return count <= 1;
    }
}
// We count how many times order breaks (nums[i] > next)
// In a rotated sorted array → only 1 break allowed
// (i+1)%n connects last → first element
