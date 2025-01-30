import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class pascal_triangle {

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            int coefficient = 1;

            for(int j = 0; j <= i; j++){
                row.add(coefficient);
                coefficient = coefficient * (i - j) / (j + 1);
            }
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int numRows = scan.nextInt();

        scan.close();
        List<List<Integer>> pascalTriangle = generate(numRows);

        for (List<Integer> row : pascalTriangle) {
            System.out.print(row + " ");
        }

    }
}
