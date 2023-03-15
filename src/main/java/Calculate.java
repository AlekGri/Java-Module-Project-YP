import java.util.Scanner;

public class Calculate {
    static String allItem = ""; //Строка с названиями всех товаров
    static double allPrice = 0.0; //счётчик общей цены
    static int i = 0; //счётчик количества товаров

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        Item item= new Item(" ", 0);
        System.out.println("Введите название товара:");

        while (true) {
            item.name = scanner.next();
            scanner.nextLine();
            if (item.name.equalsIgnoreCase("завершить")) {
                System.out.println("Вы завершили ввод товаров");
                break;
            } else {
                //проверка на число и положительность числа
                while (true) {
                    System.out.println("Введите стоймость товара в формате '00,00':");
                    if (scanner.hasNextDouble()) {
                        item.price = scanner.nextDouble();
                        scanner.nextLine();
                        if (item.price > 0) {
                            System.out.println("Товар добавлен. Вы можете добавить ещё один товар. Для подсчёта введите 'завершить'");
                            allItem = allItem.concat(item.name).concat("\n");
                            allPrice += item.price;
                            i++;
                            break;
                        }
                        if (item.price <= 0) {
                            System.out.println("Пожалуйста, введите положительное число.");
                        }
                    } else {
                        System.out.println("Пожалуйста, используйте числа.");
                        scanner.nextLine();
                    }
                }
            }
        }
    }
}
