import java.time.LocalDate;
import java.util.Scanner;
import java.lang.String;
import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static String checkLeapYear(int AYear) {
        if (AYear % 4 == 0 && AYear % 100 != 1 && AYear % 400 == 0) {
            return AYear+" год - високосный год.";
        } else {
            return AYear+" год - обычный год.";
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(in);
        int year = scanner.nextInt();
        String checking = checkLeapYear(year);
        System.out.println(checking);
        scanner.close();

    }

    public static String checkDeviceYearAndVersion(int year, int version, int currentYear) {
        if (version == 1) {
            if (year == currentYear){
                return "Установите версию приложения для Android по ссылке";
            } else {
                return "Установите облегченную версию приложения для Android по ссылке";
            }
        }
        if (version == 0) {
            if (year == currentYear) {
                return "Установите версию приложения для iOS по ссылке";
            } else {
                return "Установите облегченную версию приложения для iOS по ссылке";
            }
        }
        return null;
    }


    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2012;
        int currentYear = LocalDate.now().getYear();
        String checked = checkDeviceYearAndVersion(clientDeviceYear, clientOS, currentYear);
        System.out.println(checked);
    }

    public static String checkDeliveryDays(int distance) {
//        int distance = 23;
        int deliveryDays = 0;
        if (distance > 0 && distance < 100) {
            deliveryDays++;
            if (distance > 20) {
                deliveryDays++;
                if (distance > 60) {
                    deliveryDays++;
                }
            }
            return "Доставка дней: "+deliveryDays;
        } else {
            return "Так далеко доставки нет.";
        }
    }
        public static void task3 () {
            System.out.println("Задача 3");
            Scanner scanner = new Scanner(in);
            int deliveryDistance = scanner.nextInt();
            String checkedDeliveryDays = checkDeliveryDays(deliveryDistance);
            System.out.println(checkedDeliveryDays);
//            scanner.close();
        }
}
