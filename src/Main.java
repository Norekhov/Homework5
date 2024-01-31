public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int ios = 1;
        int android = 2;

        char clientOS = 2;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 2) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        {
            System.out.println("Задача 2");
            int iosNew = 1;
            int androidNew = 2;

            char clientDeviceYear = 2015;
            char clientOSS = 1;
            if (clientDeviceYear < 2015 && clientOSS == 1) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientDeviceYear < 2015 && clientOSS == 2) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            if (clientDeviceYear >= 2015 && clientOSS == 1) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientDeviceYear >= 2015 && clientOSS == 2) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        {
            System.out.println("Задача 3");
            int year = 2021;
            if ((year > 1584 && year % 4 == 0 && year % 100 != 0) || (year > 1584 && year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
        {
            System.out.println("Задача 4");
            int deliveryDistance = 95;
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется 1 день");
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется 2 дня");
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется 3 дня");
            } else if (deliveryDistance > 100) {
                System.out.println("Доставка не осуществлется");
            }
        }
        {
            System.out.println("Задача 5");
            int monthNomber = 1;
            switch (monthNomber) {
                case 12:
                case 1:
                case 2:
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
            }
        }
    }
}