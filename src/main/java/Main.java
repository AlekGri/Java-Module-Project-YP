import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people;
        System.out.println("Добрый день! На сколько людей надо разделить счёт?");
        while(true) {
            if (scanner.hasNextInt()) {
                people = scanner.nextInt();
                if (people == 1) {
                    System.out.println("Введите количество людей больше одного:");
                }
                if (people < 1) {
                    System.out.println("Введите корректное количество людей:");
                }
                if (people > 1){
                    break;
                }
            } else {
                System.out.println("Пожалуйста, введите количество людей, используя число:");
                scanner.nextLine();
            }
        }
        Calculate.calculate();

        double personMoney = Calculate.allPrice / people;
        String tempPrice = "Всего сумма: %.2f";
        String tempPerson = "На каждого человека: %.2f";

        System.out.println("Добавленные товары:\n" + Calculate.allItem);
        System.out.println("Всего людей: " + people);
        System.out.println(String.format(tempPrice, Calculate.allPrice) + " " + Format.GetRuble(Calculate.allPrice));
        System.out.println(String.format(tempPerson, personMoney) + " " + Format.GetRuble(personMoney));

    }
}
