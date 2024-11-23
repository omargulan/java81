package Data;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
//        Instant current = Instant.now();
/*//        System.out.println(current);
        long millies = 9_000_000_000L;
        long millies2 = -9_000_000_000L;
        Instant in1 = Instant.ofEpochMilli(millies);
        Instant in2 = Instant.ofEpochMilli(millies2);
        System.out.println(in1);
        System.out.println(in2);*/
//        LocalDateTime localDate = LocalDateTime.now();
//        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
//        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm MM.dd.yyyy");
//        System.out.println(localDate.format(formatter1));
//        System.out.println(localDate.format(formatter2));
//        String str = "14 часов 09 минут. Месяц: 02, День: 14, Год: 1966";
//        DateTimeFormatter formatter0 = DateTimeFormatter.ofPattern("HH часов mm минут. Месяц: MM, День: dd, Год: yyyy");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MM_yyyy|HH:mm");
//       LocalDateTime localDateTime = LocalDateTime.parse(str, formatter0);
//        System.out.println(localDateTime.format(formatter));
        LocalDate secretDate = LocalDate.of(2020, 1, 10);
        LocalTime secretTime = LocalTime.of(12, 30);

        int result = decode(secretDate, secretTime);
        System.out.println(result);
    }

    private static int decode(LocalDate secretDate, LocalTime secretTime) {
        // объедините secretDate и secretTime

        LocalDateTime newTime = LocalDateTime.of(secretDate, secretTime);

        // вычтите 2 месяца, 25 дней и 100 минут
        LocalDateTime secretMoment = newTime.minusMonths(2).minusDays(25).minusMinutes(100);
        // найдите произведение порядкового номера дня в году и часов из secretMoment
        return secretMoment.getDayOfYear()*secretMoment.getHour();
    }
}