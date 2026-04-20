```java
class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> res = new ArrayList<>();
        if(num == 0) return res;

        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        res.add(firstrow);

        for(int i=1;i<num;i++){
            List<Integer> prevrow = res.get(i-1);
            List<Integer> currentrow = new ArrayList<>();

            currentrow.add(1);
            for(int j=1;j<i;j++){
                currentrow.add(prevrow.get(j-1)+prevrow.get(j));
            }
            currentrow.add(1);
            res.add(currentrow);
        }
        return res;
        
    }
}
```
Approach 2: Using Combinatorial Formula
Intuition: Pascal's triangle can also be generated using combinatorial formula C(n, k) = C(n-1, k-1) + C(n-1, k), where C(n, k) represents the binomial coefficient. We can calculate each element of the triangle using this formula. This approach avoids the need for storing the entire triangle in memory, making it memory-efficient.
