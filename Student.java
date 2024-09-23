public class Student {

    private String name;
    private int[] scores;
    private double avgScores = 0.0;

    public Student(String name, int[] scores){
        this.name = name;
        this.scores = scores;
    }

    public String getName(){
        return name;
    }
    public int[] getScores(){
        return scores;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setScores(int[] scores){
        this.scores = scores;
    }

    public void calculateAverage(){
        double Scores = 0;
        for(int i=0; i<scores.length; i++){
            Scores = Scores + scores[i];
        }
        avgScores = Scores / 3;
        
        System.out.println(avgScores);
    }

    public void assignGrade(){
        String grade = " ";

        if(avgScores>89){
            grade = "A";
        }else if(avgScores>79 && avgScores<90){
            grade = "B";
        }else if(avgScores>69 && avgScores<80){
            grade = "C";
        }else if(avgScores>59 && avgScores<70){
            grade = "D";
        }else if(avgScores<61){
            grade = "F";
        }
        System.out.println(grade);
    }
}
