```
class Solution {
    public boolean findSubarrays(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n-1;i++){
           int sum = nums[i]+nums[i+1];
            if(set.contains(sum)) return true;
            set.add(sum);
        }
        return false;
    }
}
```
<img width="706" height="134" alt="image" src="https://github.com/user-attachments/assets/db77fc0e-112c-48fa-81fa-8b73eae23f1c" />
[4,2,4] given 
- 4+2 = 6 store in set [6]
- 2+4 = 6 check  present result true

[1,2,3,4,5]
- 1+2 = 3 {3}
- 2+3 = 5 {3,5}
- 3+4 = 7 {3,5,7}
- 4+5 = 9 {3,5,7,9}
- not present return false
