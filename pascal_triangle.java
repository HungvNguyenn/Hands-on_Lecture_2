import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class pascal_triangle {

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            //creating another list for each row, so that it to be added to triangle
            List<Integer> row = new ArrayList<>();

            //the pascal always start at 1, so coefficient is 1 to be added at the beginning of the row
            int coefficient = 1;

            for(int j = 0; j <= i; j++){
                row.add(coefficient);
                //using the property of binomial coefficient to directly compute value by using C(i,j) instead of needing previous row
                coefficient = coefficient * (i - j) / (j + 1);
            }
            triangle.add(row);
        }

        return triangle;
    }

    //testing cases
    public static void main(String[] args) {

        //initialize scanner and prompting user for number of rows
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int numRows = scan.nextInt();
        scan.close();

        //generating pascal triangle base on user input
        List<List<Integer>> pascalTriangle = generate(numRows);

        //printing out each row of the triangle
        for (List<Integer> row : pascalTriangle) {
            System.out.println(row + " ");
        }
    }
}
