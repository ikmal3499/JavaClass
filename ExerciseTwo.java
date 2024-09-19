public class ExerciseTwo {

    private String car;
    private int gas;

    public String getCar(){
        return car;
    }
    public int getGas(){
        return gas;
    }

    public void setCar(String car){
        this.car = car;
    }
    public void setGas(int gas){
        this.gas = gas;
    }

    public static void main(String[] args) {
        
        ExerciseTwo x = new ExerciseTwo();
        ExerciseTwo y = new ExerciseTwo();

        String[][] cars = {
            {"Saga", "Iriz", "Persona"},
            {"Axia", "Myvi", "Alza"},
            {"Hilux", "Innova", "Avanza"},
        };

        int[][] gases = {
            {5, 6, 8},
            {4, 5, 8},
            {9, 8, 7},
        };

        //looping for cars matriks
        for(int i=0; i<cars.length; i++){
            for(int j=0; j<cars[i].length; j++){
                x.setCar(cars[i][j]);
                y.setGas(gases[i][j]);
                System.out.println("Car name: " + x.getCar() + " Gas: " + y.getGas() + " liter");
                
            }
        }
    }
}
