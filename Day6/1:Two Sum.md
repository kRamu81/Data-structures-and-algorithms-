```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int c = target - nums[i];
            if(map.containsKey(c)){
                return new int[]{map.get(c),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
```
Dry Run 
nums = [2,7,11,15], target = 9
 - c = 9-2 = 7 map contains at 1
 - c = 9-7 = 2 map contains at 0
 - c = 9-11 = -2 X
 - c = 9-15 = -7 X
 - result = {1,0}
