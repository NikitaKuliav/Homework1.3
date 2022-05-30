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

    }
}