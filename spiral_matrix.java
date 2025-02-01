import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {

    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> result = new ArrayList<Integer>();

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        //while loop is uses to help travel the matrix in layers until the start and end are the same value
        while(rowStart <= rowEnd && colStart <= colEnd){
            //traversing left to right
            for(int i = colStart; i <= colEnd; i++){
                result.add(matrix[rowStart][i]);
            }
            rowStart++;

            //traversing top to bottom
            for(int i = rowStart; i <= rowEnd; i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            //the if statement make sure that it doesn't traverse a to a row that it has already been to
            // then it start to traverse right to left.
            if(rowStart <= rowEnd){
                for(int i = colEnd; i >= colStart; i--){
                    result.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            //the if statement make sure that it doesn't traverse to column that it has already been to
            //Then it start to traverse bottom to top
            if(colStart <= colEnd){
                for(int i = rowEnd; i >= rowStart; i--){
                    result.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }

        return result;
    }

    //test cases
    public static void main(String[] args) {

        //3x3 matrix, 4x3 matrix, and 5x4 matrix that has random numbers to test cases to test the spiralOder function.
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};

        int[][] matrix2 = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12}};

        int[][] matrix3 = {{1, 23, 31, 14, 5},
                           {25, 16, 27, 8, 4},
                           {9, 21, 35, 12, 2},
                           {17, 7, 15, 32, 10}};

        System.out.println("computing spiral matrix order for:{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}} ");
        System.out.println(spiralOrder(matrix));

        System.out.println("computing spiral matrix order for: {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}} ");
        System.out.println(spiralOrder(matrix2));

        System.out.println("Computing spiral matrix order for: {{1, 23, 31, 14, 5}, {25, 16, 27, 8, 4}, {9, 21, 35, 12, 2}}, {17, 7, 15, 32, 10}} };");
        System.out.println(spiralOrder(matrix3));
    }
}
