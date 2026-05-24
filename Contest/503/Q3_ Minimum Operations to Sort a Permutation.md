# Minimum Operations to Sort a Permutation

## Approach

First check the original array.

- Rotate left by one position repeatedly.
- If the array becomes:
  `0,1,2,3...`
  then store minimum operations.

Then reverse the array.

- Again rotate left repeatedly.
- Check whether it becomes sorted.

The array is a permutation because it contains all numbers from `0` to `n-1` exactly once.

We find the position of `0` because a sorted permutation must start from `0`.

Using circular indexing:

```java
arr[(pos + i) % n]
```
we verify whether the array follows:
```
0,1,2,3...
```
If not possible in both cases, return -1.
<img width="314" height="357" alt="image" src="https://github.com/user-attachments/assets/7be36663-3e7f-491b-8c3b-b1d641ff6d8c" />


```java
class Solution {

    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        // 0. Normal check
        int normal = check(nums);
        if(normal != -1) {
            int path1 = normal;
            int path2 = 2 + (n - normal) % n;
            ans = Math.min(ans, Math.min(path1, path2));
        }

        // 1. Reverse the nums
        int[] rev = new int[n];
        for(int i = 0; i < n; i++) {
            rev[i] = nums[n - 1 - i];
        }

        // 2. Rotate left by one
        int rotate = check(rev);
        if(rotate != -1) {
            int path1 = 1 + rotate;
            int path2 = 1 + (n - rotate) % n;
            ans = Math.min(ans, Math.min(path1, path2));
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    // 3. Minimum rotate to check
    private int check(int[] arr) {
        int n = arr.length;
        int pos = -1;
        // Find position of 0
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                pos = i;
                break;
            }
        }

        // 4. Permutation check if sorted
        for(int i = 0; i < n; i++) {
            if(arr[(pos + i) % n] != i) {
                return -1;
            }
        }
        return pos;
    }
}
```
 - Time Complexity : 0(n)
 - space complexity : 0(n)
