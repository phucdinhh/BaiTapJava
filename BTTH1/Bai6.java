import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        int day1,month1,year1;
        int day2,month2,year2;

        // Nhập ngày A
        System.out.println("Enter day, month, year of date A: ");
        day1 = scanner.nextInt();
        month1 = scanner.nextInt();
        year1 = scanner.nextInt();

        // Nhập ngày B
        System.out.println("Enter day, month, year of date B: ");
        day2 = scanner.nextInt();
        month2 = scanner.nextInt();
        year2 = scanner.nextInt();

        scanner.close();

        cal1.set(year1,month1-1,day1);
        cal2.set(year2,month2-1,day2);
        LocalDate dayA = LocalDate.of(year1,month1,day1);
        LocalDate dayB = LocalDate.of(year2,month2,day2);

        // Xuất 2 ngày A và B
        System.out.println("Day A: "+formatter.format(dayA));
        System.out.println("Day B: "+formatter.format(dayB));

        // So sánh 2 ngày A và B
        if (dayA.compareTo(dayB) == 0) System.out.println("Both days are equal");
        else if (dayA.compareTo(dayB) > 0) System.out.println("Day A is after Day B");
        else if (dayA.compareTo(dayB) < 0) System.out.println("Day A is before Day B");

        // In ra ngày trước và ngày sau của ngày A
        System.out.println("The day before day A is " + formatter.format(dayA.plusDays(-1)));
        System.out.println("The day after day A is " + formatter.format(dayA.plusDays(1)));

        // Cho biết A là ngày thứ mấy trong năm
        System.out.println("Day A is the day " + dayA.getDayOfYear() + " of year");

        // Cho biết tháng có bao nhiêu ngày
        System.out.println("Days of month: "+ dayA.lengthOfMonth());

        // Cho biết năm chứa A có phải năm nhuận hay không
        if(dayA.isLeapYear()) System.out.println(formatter.format(dayA) + " is Leap Year");
        else System.out.println(formatter.format(dayA) + " is not Leap Year");

    }
}
