```java
class Solution {
    public boolean canJump(int[] nums) {
        int jump = 0;
        for(int i=0;i<nums.length;i++){
            if(i > jump){
                return false;
            } 
            jump = Math.max(jump,i+nums[i]);
        }
        return true;
    }
}
```
Approach : 
 * nums = [2,3,1,1,4]
 * from index 0 (2) move 2 jumps 3 ,1
 * from index 1 (3) move 3 jumps 1,1,4
 * it satifies the end then return result true

condition i > jump return false
| i | nums[i] | jump         | reachable?  |
| - | ------- | ------------ | ----------- |
| 0 | 2       | max(0,0+2)=2 | Yes         |
| 1 | 3       | max(2,1+3)=4 | Yes         |
| 2 | 1       | max(4,2+1)=4 | Yes         |
| 3 | 1       | max(4,3+1)=4 | Yes         |
| 4 | 4       | max(4,4+4)=8 | Reached end |
