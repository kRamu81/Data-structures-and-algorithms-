# SQL Questions and Answers

---

## 1. SQL Joins

### Question
Ravi wants to join two sports-related tables. He requires all tuples, matched and unmatched both from the right table to appear, along with only the matching tuples from the left table. Which join is appropriate?

### Answer
**RIGHT OUTER JOIN (RIGHT JOIN)**

---

## 2. Conceptual View of Joins

### Question
In relational algebra, joins are conceptually viewed as a combination of ______ with ______.

### Answer
**Cartesian Product** with **Some Condition**

---

## 3. Equality Condition Join

### Question
Sarah wants to merge two database tables using an equality condition. Which type of join represents this case?

### Answer
**Equi Join**

---

## 4. SQL String Replacement

### Question
What will be the output of the following SQL function call?

```sql
SELECT REPLACE('JavaIsGreatJava', 'Java', 'SQL');
```

### Answer
```text
SQLIsGreatSQL
```

---

## 5. Database Relationship Cardinality

### Question
If there is a directed line from the relationship mentor to both entities student and teacher, what does this indicate about cardinality?

### Answer
**One-to-One Relationship**

---

## 6. Pattern Matching in Student IDs

### Question
The STUDENTS table has the following columns:

- CLASS_ID NUMBER(4)
- LAST_NAME VARCHAR2(25)
- STUDENT_ID VARCHAR2(10)

Which SQL statement would correctly fetch records where the STUDENT_ID contains the text `ABC`?

### Answer
```sql
SELECT class_id, last_name, student_id
FROM students
WHERE student_id LIKE '%ABC%';
```

---

## 7. SQL LIKE Operator

### Question
Which of the following statements correctly describe the use of the LIKE operator in SQL?

A: It is not case sensitive.  
B: LIKE `%abc` finds values ending with "abc".  
C: LIKE `%ABC%` finds values containing "ABC" anywhere.  
D: LIKE `_AC_` matches 4-character values where the 2nd and 3rd characters are "A" and "C".

### Answer

- **A:** False
- **B:** True
- **C:** True
- **D:** True

---

## 8. SQL Query Error Spotting

### Question
Identify the part of the query that contains the error.

```sql
(A) SELECT emp_id, first_name, department
(B) FROM employees
(C) WHERE SUBSTR(department, 1, 1) < TO_NUMBER('H') AND emp_id < 500
(D) ORDER BY department ASC, emp_id DESC
```

### Answer
**Part (C)** contains the error.

### Explanation
```sql
TO_NUMBER('H')
```

is invalid because `'H'` is not a numeric value.  
This causes an **invalid number error**.

---

## 9. SQL EXCEPT Operator Query

### Question
Consider a table named Students with columns such as StudentID, Name, and Score.

What will be the output of the following SQL query?

```sql
SELECT *
FROM Students
WHERE Score BETWEEN 70 AND 100

EXCEPT

SELECT *
FROM Students
WHERE Score BETWEEN 85 AND 95;
```

### Answer
The query returns:

> Students from the first query's result set that are not present in the second query's result set.

### Explanation
- First query selects students with scores between 70 and 100.
- Second query selects students with scores between 85 and 95.
- `EXCEPT` removes the common rows from the first result.

---

## 10. SQL Nested String Functions

### Question
What will be the output of the following SQL query?

```sql
SELECT SUBSTR('zyxw_abc', INSTR('abcdefgh', 'c'), 4)
FROM dual;
```

### Step-by-Step Explanation

```sql
INSTR('abcdefgh', 'c')
```

returns:

```text
3
```

Then:

```sql
SUBSTR('zyxw_abc', 3, 4)
```

starts from position 3 and takes 4 characters.

String:
```text
zyxw_abc
```

Characters from position 3:
```text
xw_a
```

### Answer
```text
xw_a
```

---