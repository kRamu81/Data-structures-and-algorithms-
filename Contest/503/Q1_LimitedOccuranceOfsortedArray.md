# Limit Occurrences in Sorted Array

## Approach

Since the array is already sorted, duplicate elements appear together.

We use a variable `count` to track the occurrences of the current element.

- If the current element is same as previous element, increment `count`.
- Otherwise reset `count = 1`.
- Add the element to the result only when `count <= k`.

This keeps the relative order same and ensures every element appears at most `k` times.

---

## Code

```java
class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        int count = 1;

        list.add(nums[0]);

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if(count <= k) {
                list.add(nums[i]);
            }
        }

        int[] ans = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
