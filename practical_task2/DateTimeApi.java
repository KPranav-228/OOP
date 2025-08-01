package practical_task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeApi {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Current Date-Time: " + dt.format(fmt));

        LocalDate start = LocalDate.of(2025, 1, 1);
        Period diff = Period.between(start, LocalDate.now());
        System.out.println("Difference: " + diff.getYears() + " years, " + diff.getMonths() + " months");
    }
}
