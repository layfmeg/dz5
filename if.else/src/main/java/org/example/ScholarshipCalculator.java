import java.util.Scanner;

public class ScholarshipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[5];
        double sum = 0;

        System.out.println("Введите свои оценки по 5 предметам:");

        for (int i = 0; i < 5; i++) {
            while (true) {  // Проверка ввел ли пользователь правильное число
                System.out.print("Оценка " + (i + 1) + ": ");
                if (scanner.hasNextDouble()) {
                    double grade = scanner.nextDouble();
                    if (grade >= 0 && grade <= 12) {
                        grades[i] = grade;
                        sum += grade;
                        break;
                    } else {
                        System.out.println("Пожалуйста, введите оценку от 0 до 12.");
                    }
                } else {
                    System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                    scanner.next(); // Очистка некорректного ввода
                }
            }
        }

        double average = sum / grades.length;
        System.out.printf("Ваш средний балл: %.2f%n", average);

        if (average >= 10) {
            System.out.println("Вы получаете повышенную стипендию.");
        } else if (average >= 8) {
            System.out.println("Вы получаете обычную стипендию.");
        } else {
            System.out.println("Вы не получаете стипендию.");
        }

        scanner.close();
    }
}
