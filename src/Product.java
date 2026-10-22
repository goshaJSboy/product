import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        String[] products = { "Moloko", "Myaso", "Hleb", "Salo" };
        int[] price = { 123, 221, 45, 150 };

        System.out.println("Список продуктов:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + price[i] + " руб/шт");
        }

        int[] counts = new int[products.length];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер продукта и количество или end:");
            String input = scanner.nextLine().trim();
            if (input.equals("end")) {
                break;
            }

            String[] parts = input.split("\\s+");
            if (parts.length != 2) {
                System.out.println("Нужно два числа");
                continue;
            }
            int number;
            int things;
            try {
                number = Integer.parseInt(parts[0]) - 1;
                things = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Введите числа");
                continue;
            }
            if (number < 0 || number >= products.length || things <= 0) {
                System.out.println("Неверный номер или количество");
                continue;
            }
            counts[number] += things;
        }
        //  Вывод корзины — уже ПОСЛЕ цикла
        System.out.println("\nВаша корзина:");
        int total = 0;
        for (int i = 0; i < products.length; i++) {
            if (counts[i] > 0) {
                int sum = price[i] * counts[i];
                total += sum;
                System.out.println(products[i] + " " + counts[i] + " шт "
                        + price[i] + " руб/шт " + sum + " руб в сумме");
            }
        }
        System.out.println("Итого " + total + " руб");
    }
}
