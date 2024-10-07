import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] arguments) {

        //Two Dimensional Array
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("---------Matrics length--------");
        System.out.println();
        char[][] ttt = new char [3][3];
        ttt[0][0]='x';
        System.out.println(ttt.length+" rows of array");

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("----Matrics Row and Collumn----");
        System.out.println();
        int[][] matrix = {
            {1,2,3},
            {4,5,6,7},
            {8,9}
        };

        System.out.println("Matrix length : " + matrix.length);

        for(int row=0; row<matrix.length; row++){
            System.out.println("Length of array " + (row+1) + ": " + matrix[row].length);
            for(int col=0; col<matrix[row].length; col++){
                System.out.println(matrix[row][col]);
            }
        }

        //Declaration array of different data type
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("---Default Value of Variables---");
        System.out.println();
        int[] num = new int[1];
        double[] dub = new double[1];
        char[] hur = new char[1];
        boolean[] boo = new boolean[1];
        String[] wor = new String[1];

        for(int i=0; i<num.length; i++){
            System.out.println("Default Value for int: " + num[i]);
            System.out.println("Default Value for double: " + dub[i]);
            System.out.println("Default Value for char: " + hur[i]);
            System.out.println("Default Value for boolean: " + boo[i]);
            System.out.println("Default Value for String: " + wor[i]);
        }
        
        //Handle out of bounds array
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("---Handle Array out of bounds---");
        System.out.println();
        int[] numbers = {10, 20, 30, 40, 50};
        
        try{
            for(int n=0; n<numbers.length+1; n++){
                System.out.println(numbers[n]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught bad " + e.getMessage());
        }finally{
            System.out.println("Continue...");
        }
            
        //Boolean variables
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("------------Boolean------------");
        System.out.println();
        boolean isLoggedIn = true, hasPermission = false;
        Scanner scan = new Scanner(System.in);
        
        while(isLoggedIn && !hasPermission){
            System.out.println("Login or not[yes/no]: ");
            String log = scan.nextLine();

            if(log.equalsIgnoreCase("yes")){
                isLoggedIn = true;
                System.out.println("Have permission[yes/no]: ");
                String per = scan.nextLine();
                if(per.equalsIgnoreCase("yes")){
                    hasPermission = false;
                    System.out.println("The program will continue ...");
                }else if(per.equalsIgnoreCase("no")){
                    hasPermission = true;
                }
            }else if(log.equalsIgnoreCase("no")){
                isLoggedIn = false;
            }
            System.out.println("Exiting loop ....");
        }
        System.out.println("Program Ended...");
    }
}
