public class BreakLoops {
    
    public static void main(String[] args) {
        System.out.println("Using break");

        for(int i=1; i<=5; i++){
            if(i==3)
                break;
                // most common use of break is in loading
            System.out.println(i);
        }
    }
}
