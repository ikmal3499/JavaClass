import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDate nowD = LocalDate.now();
        LocalTime nowT = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");//uppercase lowercase main peranan
        String formattedDT = formatter.format(nowDt);
        
        LocalDate birDate = LocalDate.of(1999, 04, 03);
        Period age = Period.between(nowD, birDate);

        System.out.println(nowDt);
        System.out.println(nowD);
        System.out.println(nowT);
        System.out.println(formattedDT);
        System.out.println(age);
    }
}
