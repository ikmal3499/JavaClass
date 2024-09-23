public class studentManagement {
    public static void main(String[] args) {

        Student student = new Student(null, null);

        int[][] scores= {
            {88, 77, 76},
            {55, 88, 67},
            {25, 45, 62},
            {96, 66, 70},
            {89, 92, 97},
        };

        String[] studName = {"Anas", "Luqman", "Anep", "Didi", "Syera"};

        for(int row=0; row<scores.length; row++){

            String subject = " ";
            student.setScores(scores[row]);
            student.setName(studName[row]);

            System.out.println("Name " + student.getName());

            for(int col=0; col<scores[row].length; col++){
                if(col == 0){
                    subject = "Math: ";
                }else if(col == 1){
                    subject = "Science: ";
                }
                else if(col == 2){
                    subject = "English: ";
                }
                System.out.println(subject + student.getScores()[col]);
            }

            System.out.print("Average Score: ");
            student.calculateAverage();
            System.out.print("Grade: ");
            student.assignGrade();
            System.out.println("----------------------------------------");
        }
    }
}
