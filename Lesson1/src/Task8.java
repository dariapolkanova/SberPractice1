import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задание 8");
        System.out.println("Отгадайте загадку. Что это такое: синий, большой, с усами и полностью набит зайцами. У вас есть 3 попытки.");

        String rihgt_answer = "Троллейбус";
        String sur = "Сдаюсь";
        int c = 3;
        boolean i = false;

        do {
            if (c == 3) {
                System.out.print("> ");
                String answer = in.next();
                if (answer.equals(rihgt_answer)) {
                    i = true;
                    System.out.print("Правильно!");
                }
                else if (answer.equals(sur)) {
                    i = true;
                    System.out.print("Правильный ответ: троллейбус");
                }
                else {
                    c--;
                }
            }
            else if (c > 0)  {
                System.out.println("Подумай ещё.");
                System.out.print("> ");
                String answer = in.next();
                if (answer.equals(rihgt_answer)) {
                    i = true;
                    System.out.print("Правильно!");
                }
                else if (answer.equals(sur)) {
                    i = true;
                    System.out.print("Правильный ответ: троллейбус");
                }
                else {
                    c--;
                }
            }
            else if (c == 0) {
                i = true;
                System.out.print("Вы не отгадали. Правильный ответ - троллейбус");
            }
        }
        while (i == false);

        in.close();
    }
}
