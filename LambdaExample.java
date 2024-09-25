import java.util.function.Predicate;

public class LambdaExample {
    public static void main(String[] args){
        Predicate<Integer>isGreaterThanThen =  (num) -> num > 10;//arrow tuu indicate this number is gonna be this number
        int num = 15, num2 = 9;

        if(isGreaterThanThen.test(num)){
            System.out.println(num + " is greater than 10");
        }else{
            System.out.println(num + " is less than 10");
        }

        if(isGreaterThanThen.test(num2)){
            System.out.println(num2 + " is greater than 10");
        }else{
            System.out.println(num2 + " is less than 10");
        }
    }
    
}
