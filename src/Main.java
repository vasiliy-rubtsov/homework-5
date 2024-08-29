public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        {
            int os = 1;

            if (os == 0) {
                // iOS
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                // Android
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println("--------------");

        // Задача 2
        System.out.println("Задача 2");
        {
            int os = 1;
            int year = 2013;

            if (year < 2015) {
                if (os == 0) {
                    // iOS
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    // Android
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            } else {
                if (os == 0) {
                    // iOS
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    // Android
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }

        }
        System.out.println("--------------");

        // Задача 3
        System.out.println("Задача 3");
        {
            int year = 1900;

            if (
                year > 1584
                && year % 4 == 0
                && (year % 100 != 0 || year % 400 == 0)
            ) {
                System.out.println(year +  " год является високосным");
            } else {
                System.out.println(year +  " год не является високосным");
            }

        }
        System.out.println("--------------");

        // Задача 4
        System.out.println("Задача 4");
        {
            int deliveryDistance = 95;
            int deliveryDays;

            if (deliveryDistance <= 20) {
                // до 20 км - 1 сутки
                deliveryDays = 1;
            } else if (deliveryDistance <= 60) {
                // от 20 до 60 км - 2 суток
                deliveryDays = 2;
            } else if (deliveryDistance <= 100) {
                // от 60 до 100 км - 3 суток
                deliveryDays = 3;
            } else {
                // свыше 100 км - доставка не производится
                deliveryDays = -1;
            }

            if (deliveryDays < 0) {
                System.out.println("Расстояние свыше 100 км - доставка не производится");
            } else {
                System.out.println("Потребуется дней: " + deliveryDays);
            }

        }
        System.out.println("--------------");

        // Задача 5
        System.out.println("Задача 5");
        {
            int monthNumber = 12;

            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Некорректно указан номер месяца");
            }
        }
        System.out.println("--------------");
    }
}