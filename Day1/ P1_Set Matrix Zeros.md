```python
class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)
        m = len(matrix[0])
        
        row = [False] * n
        col = [False] * m
        
        for i in range (n):
            for j in range (m):
                if matrix[i][j] ==0:
                    row[i] = True
                    col[j] = True
                    
        for i in range (n):
            for j in range (m):
                if row[i] or col[j]:
                    matrix[i][j] =0
        
        ```

```java
class Solution {
    public void setZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        boolean[] row = new boolean[n];  // initially false
        boolean[] col = new boolean[m];  // initially false

        // first pass: mark rows & cols that contain 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // second pass: zero out marked rows and cols
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || col[j]) {
                    mat[i][j] = 0;
                }
            }
        }
    }
}
```

3. Time and space complexity
Your idea is correct:
Time: [O(mn)] (two full passes over the matrix). 
Space: [O(m+n)] (two extra arrays of size n and m).