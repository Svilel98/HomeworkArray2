public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        int day = 29;
        for (int i = 0; i <= day - 1; i++) {
            sum += arr[i];
            if (i == day - 1) {
                System.out.println(sum);
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxspending = -1;
        int minspending = 100000000;
        int day = 30;
        for (int i = 0; i <= day - 1; i++) {
            if (arr[i] > maxspending) {
                maxspending = arr[i];
            } else if (arr[i] < minspending) {
                minspending = arr[i];
            }
            if (i == day - 1) {
                System.out.println("Минимальная сумма трат за день составила " + minspending + " рублей." +
                        " Максимальная сумма трат за день составила " + maxspending + " рублей");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int day = 30;
        float sum = 0;
        for (int i = 0; i <= day - 1; i++) {
            sum += arr[i];
            if (i == day - 1) {
                float averageSum = sum / day;
                System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i >= 0) {
                System.out.print(reverseFullName[i]);
            }
        }
    }
}