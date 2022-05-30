public class Main {
    public static void main(String[] args) {

        // Задание 1

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        // Задание 2

        int friday = 2;

        System.out.println();
        for (int day = 1; day <= 31; day++) {
            if (day % 7 == friday) {
                System.out.println("Сегодня пятница, " + day + " -е число. Необходимо подготовить отчет.");
            }
        }

        // Задание 3

        System.out.println();
        int currentYear = 2022;
        int comet = 79;

        for (int year = currentYear - 200; year < (currentYear + 100); year ++) {
            if (year % comet == 0) {
                System.out.println(year);
            }
        }
    }
}