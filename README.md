# Pascal's Triangle & Spiral Matrix
This repository provides solutions to two LeetCode Problems:
1. [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)
   - Takes an Integer input(n) and outputs the (n) rows of Pascal's Triangle
2. [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)
   - Takes in a 2D integer matrix input and outputs an Arraylist of integers
   - Moves in circular motion, starting from the top left most corner, moving to the right of the row, moving down the column top to bottom, going right to left on the bottom row, then  back up to the top row.
   - Continuing this pattern until all inner circles are parsed through.
   - Example, if the following matrix is provided: 
```math
  \begin{bmatrix} 
    1, 2, 3\\ 
    4, 5, 6\\
    7, 8, 9
  \end{bmatrix}
```
   - The following output is the result:
```math
  \begin{bmatrix} 
    1, 2, 3, 6, 9, 8, 7, 4, 5
  \end{bmatrix}
```

# How to Run
## Pascal's Triangle
