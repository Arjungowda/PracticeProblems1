import java.util.Scanner;

/**
 * Created by mandy on 1/16/2016.
 */
public class matrixSetZero {
    public static void main(String[] args){
    int[][] matrix = new int[5][5];
    Scanner scan = new Scanner(System.in);
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            matrix[i][j] = scan.nextInt();
        }
    removeZero(matrix);

    }
    }
    public static void removeZero(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
            if(row[i] || col[j])
                matrix[i][j] = 0;
            }
        }
        for(int i=0;i<5;i++) {
            System.out.println(" ");
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
    }

}
