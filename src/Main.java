public class Main {
    public static void main(String[] args) {
        int[] costs = generateRandomArray();

        // Задание 1
        System.out.println("Задание 1");
        int sum = 0;
        for (int cost : costs) {
            sum += cost;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        // Задание 2
        System.out.println("Задание 2");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int cost : costs) {
            if (cost > max) {
                max = cost;
            }
            if (cost < min) {
                min = cost;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        double averageCost = (double) sum / costs.length;
        System.out.println("Средняя сумма трат за месяц составила " + String.format("%.2f", averageCost) + " рублей");
        System.out.println();

        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.println(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

