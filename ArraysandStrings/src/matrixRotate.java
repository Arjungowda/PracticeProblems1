    /**
 * Created by mandy on 2/17/2016.
 */
public class matrixRotate {
    public static void main(String[] args){
        int[][] matrix = {{10,20,30,40},
                        {50,60,70,80},
                        {11,12,0,14},
                        {21,22,23,24}};
        rotate(matrix,4);
        checkForZeroinMatrix(matrix);
    }
        public static void rotate(int[][] mat, int n){
            for(int layer = 0; layer < n/2 ; ++layer){
                int first = layer;
                int last = n - 1 - layer;
                for(int i = first; i<last;++i){
                    int offset = i - first;
                    //save top
                    int top = mat[first][i];
                    //left -> top
                    mat[first][i] = mat[last-offset][first];
                    //bottom - > left
                    mat[last - offset][first] = mat[last][last-offset];
                    //right -> bottom
                    mat[last][last-offset] = mat[i][last];
                    //top -> right
                    mat[i][last] = top;
                }
                printMatrix(mat);
                System.out.print("\n");
            }
        }

        public static void checkForZeroinMatrix(int[][] mat){
            boolean[] row = new boolean[mat.length];
            boolean[] col = new boolean[mat[0].length];
            for(int i=0;i<mat.length;i++)
                for(int j =0;j<mat[0].length;j++){
                    if(mat[i][j] == 0){
                        row[i] = true;
                        col[j] = true;
                    }
                }
            for(int i=0;i<mat.length;i++)
                for(int j =0;j<mat[0].length;j++) {
                    if(row[i] || col[j]){
                        mat[i][j] = 0;
                    }
                }
            printMatrix(mat);
        }

        public static void printMatrix(int[][] mat){
            for(int i = 0;i<4;i++){
                System.out.print("\n");
                for(int j=0;j<4;j++){
                    System.out.print(mat[i][j]);
                    System.out.print(" ");
                }
            }
        }
}
