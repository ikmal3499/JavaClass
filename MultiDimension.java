import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] arguments) {

        //Two Dimensional Array
        char[][] ttt = new char [3][3];
        ttt[0][0]='x';
        System.out.println(ttt.length+"in a row");

        int[][] matrix = {
            {1,2,3},
            {4,5,6,7},
        };

        System.out.println("Matrix length : " + matrix.length);

        for(int row=0; row<matrix.length; row++){
            System.out.println("Length of aray " + row + " : " + matrix[row].length);
            for(int col=0; col<matrix[row].length; col++){
                System.out.println(matrix[row][col]);
            }
        }

        //Declaration array of different data type
        int[] num = new int[2];
        double[] dub = new double[2];
        char[] hur = new char[2];
        boolean[] boo = new boolean[2];
        String[] wor = new String[2];

        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
            System.out.println(dub[i]);
            System.out.println(hur[i]);
            System.out.println(boo[i]);
            System.out.println(wor[i]);
        }
        
        //Handle out of bounds array
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
                    System.out.println("The program will continue anyway..");
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
