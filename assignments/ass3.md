
## Assignment 3: Attendance Report

**Concepts:** DP, Brute Force, Arrays

### Question
Store 10 days of attendance in an array. Build a running total array once.

1. Print total attendance from day 3 to day 7 using one subtraction.
2. Find the day with the highest attendance by checking every day.

### Edge Cases
- Range starts from day 1.
- Invalid range (example: day 8 to day 3).

### Think About – Answers

**1. Which part is DP and which part is Brute Force?**

- DP: Building the running total array and reusing previous totals.
- Brute Force: Checking every day to find the highest attendance.

**2. How many operations does each part take?**

- Running total: 10 additions – O(n).
- Range calculation: 1 subtraction – O(1).
- Finding highest attendance: 9 comparisons – O(n).


