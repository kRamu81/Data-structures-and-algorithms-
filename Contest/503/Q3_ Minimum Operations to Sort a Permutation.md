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

## Here is a step-by-step mathematical dry-run execution using the exact example input nums = [1, 2, 3, 4, 0] ($n = 5$), breaking down exactly how your corrected logic computes the optimal answer.
------------------------------
## 🏁 Step-by-Step Execution Matrix## 1. Setup & Variables

* nums = [1, 2, 3, 4, 0]
* ans = Integer.MAX_VALUE

------------------------------
## 2. Block 0: Normal Array Check
We evaluate the array as it is: [1, 2, 3, 4, 0].

* Locating '0': Found at pos = 4.
* Sequential Order Check: We check elements moving cyclically right from index 4:
* Index 4: arr[4] == 0 (Valid)
   * Index 0: arr[0] == 1 (Valid)
   * Index 1: arr[1] == 2 (Valid)
   * Index 2: arr[2] == 3 (Valid)
   * Index 3: arr[3] == 4 (Valid)
* Result: The sequence is sequentially valid! normal = 4.

## Cost Paths Calculated:

* path1 (Shift Left Only): normal = 4 operations.
* path2 (Double Reverse Sandwich): 2 + (5 - 4) % 5 = 2 + 1 = 3 operations.
* Update Global Minimum: ans = Math.min(MAX_VALUE, Math.min(4, 3)) $\rightarrow$ ans = 3.

------------------------------
## 3. Block 1: Generate Reversed Array

* rev = [0, 4, 3, 2, 1]

------------------------------
## 4. Block 2: Reversed Array Check
We evaluate the reversed array: [0, 4, 3, 2, 1].

* Locating '0': Found at pos = 0.
* Sequential Order Check: We check elements moving cyclically right from index 0:
* Index 0: arr[0] == 0 (Valid)
   * Index 1: arr[1] == 4 $\rightarrow$ Expected 1! ❌ (Fails forward sequence check).
* Result: rotate = -1. This block skips updating the variables.

------------------------------
## 5. Final Return Execution

* ans remains 3.
* return ans == Integer.MAX_VALUE ? -1 : ans; $\rightarrow$ Returns 3.

------------------------------
##  Visualizing the Paths
Here is a high-level visual representation layout showing how the two options inside the normal block are evaluated to find the absolute minimum operation path:
```
                  INPUT: [1, 2, 3, 4, 0]
                            │
               ┌────────────┴────────────┐
               ▼                         ▼
         [ check(nums) ]           [ check(rev) ]
         Returns pos = 4           Returns pos = -1
               │                         │
      ┌────────┴────────┐                ▼
      ▼                 ▼             (Skipped)
   Path 1            Path 2
 (Shift Only)   (Double Reverse)
    Cost: 4        Cost: 2 + (5 - 4)
                        = 3
      │                 │
      └────────┬────────┘
               ▼
         Math.min(4, 3) 
               │
               ▼
         FINAL ANS = 3 (Optimal 🎉)
```

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
