import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascal_triangle{
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0){
            return triangle;
        }

        triangle.add(List.of(1));

        List<Integer> row = new ArrayList<>();
        for(int i = 1; i < numRows; i++){
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            for(int j = 1; j < prevRow.size(); j++){
                newRow.add(prevRow.get(j) + prevRow.get(j - 1));
            }
            newRow.add(1);
            triangle.add(newRow);
        }
        return triangle;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number of rows: ");
        int n = scan.nextInt();

        System.out.println(generate(n));
    }
}