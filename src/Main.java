import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] weeklyExpenses = generateRandomArray(5);
        int totalExpenses = 0;
        for (int i = 0; i < weeklyExpenses.length; i++)
            totalExpenses += weeklyExpenses[i];
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");
        if (totalExpenses == 0) {
            System.out.print("Суммы трат за месяц нет");
        }
        System.out.println("Task 2");
        int minExpense = weeklyExpenses[0];
        int maxExpense = weeklyExpenses[0];
        for (int i = 1; i < weeklyExpenses.length; i++) {
            if (weeklyExpenses[i] < minExpense) {
                minExpense = weeklyExpenses[i];
            }
            if (weeklyExpenses[i] > maxExpense) {
                maxExpense = weeklyExpenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей. ");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");
        System.out.println("Task 3");
        totalExpenses = 0;
        for (int i = 0; i < weeklyExpenses.length; i++) {
            totalExpenses += weeklyExpenses[i];
        }
        double averageExpenses = (double) totalExpenses / weeklyExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int middle = reverseFullName.length / 2;

        // Меняем местами символы с начала и конца массива
        for (int i = 0; i < middle; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(String.valueOf(reverseFullName));
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}
