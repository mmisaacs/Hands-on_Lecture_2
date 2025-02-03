import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class spiral_matrix {
    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> result = new ArrayList<>();

        //setting boundaries
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        return result;
    }

    /*public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("The following matrix is an example of an acceptable input:");
        System.out.println("[[1,2,3,4],[5,6,7,8],[9,10,11,12]]\n");

        System.out.print("Please enter number of rows: ");
        int row = scan.nextInt();
        System.out.print("Please enter number of columns: ");
        int col = scan.nextInt();
        System.out.print("Please enter a matrix: ");
        String input = scan.nextLine();

        int[][] matrix = new int[row][col];
        int rowCount = 0;
        int colCount = 0;

        for(int i = 0; i < input.length(); i++){
            char v = input.charAt(i);
            if(v == '[' || v == ']' || v == ','){
                continue;
            }
            else{
                matrix[rowCount][colCount] = v - '0';
                if(colCount == (col - 1)){
                    rowCount++;
                    colCount = 0;
                }
                else{
                    colCount++;
                }
            }
        }

        for(int p = 0; p < row; p++){
            for(int o = 0; o < col; o++){
                System.out.print(matrix[p][o]);
            }
            System.out.println();
        }
    }*/
}
