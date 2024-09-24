public class Finally {
    public static void main(String[] args) {
        try{
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught bad " + e.getMessage());
        }finally{
            System.out.println("It will continue anyway");
        }
        //contoh cam nk booking tpi ade org lain nk book jugak dlm masa yang same
        System.out.println("The program is continuing");
    }
}
