public class TDArray {
     public static void main(String [] args){
        int[][] matrix = new int[4][4];//3 rows 4 collumn

        matrix[0][0]=1; matrix[0][1]=1; matrix[0][2]=1; matrix[0][3]=1;
        matrix[1][0]=2; matrix[1][1]=1; matrix[1][2]=1; matrix[1][3]=1;
        matrix[2][0]=2; matrix[2][1]=1; matrix[2][2]=1; matrix[2][3]=1;
        matrix[3][0]=2; matrix[3][1]=1; matrix[3][2]=1; matrix[3][3]=1;

        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                System.out.println(matrix[row][col]);
            }
        }

        
        int[][] arrays = {
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4},
        };
        
        for(int[] array: arrays){
            for(int numbers: array){
                System.out.println(numbers);
            }
        }
     }
}
