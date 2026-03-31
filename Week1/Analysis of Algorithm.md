# 📘 Analysis of Algorithms

## 🔹 What is Algorithm Analysis?

Algorithm Analysis is the process of evaluating:
- Time taken by an algorithm
- Space (memory) used by an algorithm

👉 Goal: Write efficient programs

---

## 🔹 Why Algorithm Analysis?

- Helps compare different solutions
- Choose the best approach
- Optimize performance

---

## 🔹 Types of Time Complexity

### ✅ 1. Best Case
- Minimum time taken
- Example: Element found at first position

👉 Notation: Ω (Omega)

---

### ✅ 2. Worst Case
- Maximum time taken
- Example: Element found at last position

👉 Notation: O (Big-O)

---

### ✅ 3. Average Case
- Expected time for random input

👉 Between best and worst case

---

## 🔹 Asymptotic Notations

Used to represent time complexity mathematically.

---

### 🔸 1. Big-O Notation (O)

- Represents **upper bound**
- Focuses on worst-case scenario

#### Example:
O(n), O(log n), O(n²)

---

### 🔸 2. Omega Notation (Ω)

- Represents **lower bound**
- Best-case scenario

#### Example:
Ω(1), Ω(log n)

---

### 🔸 3. Theta Notation (Θ)

- Represents **tight bound**
- Exact performance (average case)

#### Example:
Θ(n), Θ(n log n)


---

## 🔹 Common Time Complexities

| Complexity | Name              | Example                  |
|------------|------------------|--------------------------|
| O(1)       | Constant         | Array access             |
| O(log n)   | Logarithmic      | Binary Search            |
| O(n)       | Linear           | Linear Search            |
| O(n log n) | Linear Log       | Merge Sort               |
| O(n²)      | Quadratic        | Bubble Sort              |

---

## 🔹 Example: Linear Search

```java
for(int i = 0; i < n; i++) {
    if(arr[i] == target) {
        return i;
    }
}
