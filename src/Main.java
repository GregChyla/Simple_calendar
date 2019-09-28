import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate data = LocalDate.now();

        int today = data.getDayOfMonth();
        int month = data.getMonthValue();

        data = data.minusDays(data.getDayOfMonth()-1); //set starting date to 1

        int weekdayValue = data.getDayOfWeek().getValue();

        System.out.println(" Mon, Tue, Wed, Thu, Fri, Sat, Sun");
        System.out.println("----------------------------------");
        if (weekdayValue > 1){
            for (int i = 0; i < weekdayValue-1 ; i++) {
                System.out.print("     "); //put leading spaces if month starts after Monday
            }
        }
        while (data.getMonthValue() == month){
            System.out.printf("%4d", data.getDayOfMonth());
            if (data.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (data.getDayOfWeek().getValue() == 7) System.out.println();
            data = data.plusDays(1);
        }
    }
}