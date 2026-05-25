/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
```
class Solution {
    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        while(set.contains(k-root.val)){
            return true;
        }
        set.add(root.val);
        return findTarget(root.left,k) || findTarget(root.right,k);
    }
}
```

<img width="406" height="303" alt="image" src="https://github.com/user-attachments/assets/878b724e-be72-453c-b75c-d501e80d3dfc" />
root = [5,3,6,2,4,null,7], k = 9
- following dfs traversal 5 3 2 4 6 7
-  9 - 5 = 4 required 4 store 5 in set [5]
-  9-3 = 6 required 6 store 3 in set  [5,3]
-  9-2 = 7 required 2 store 2 in set [5,3,2]
-  9-4 = 5 already 5 present in set  so result is true
