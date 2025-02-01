# Hands-on_Lecture_2
**Pascal_Triangle.java:**

A program that implements Pascal's triangle. In Pascal's triangle, each number is the sum of the two numbers
that is directly above it.

for example, if the input of rows is 5; the Pascal triangle would be shown like so:

                    1                
                   1 1                   
                  1 2 1                 
                 1 3 3 1               
                1 4 6 4 1
                
The implementation uses binomial coefficient properties to compute each row number using C(i,j). The implementation uses a List<List<Integer>> to make the triangle and a List<Integer> to keep track of the 
numbers in the rows. there is a test case that asks the user for how many rows and then creates the pascal triangle.



**Spiral_matrix.java:**

This program returns a spiral order of a given 2D array. 

for example:

input: matrix = [[1,2,3]
                 [4,5,6]
                 [7,8,9]]

output: [1,2,3,6,9,8,7,4,5]

The implementation uses a while loop to help traverse the matrix. inside the while loops, there are multiple for loops that help it traverse the matrix in a certain direction. It also has if statements to make sure it does not traverse
to where it has already been. there are multiple test cases with different matrices to test the spiral matrix function.

