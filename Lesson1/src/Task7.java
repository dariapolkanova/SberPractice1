public class Task7 {
    public static void main(String[] args) {
        System.out.println("Первые 11 членов последовательности Фибоначчи:");
        int a = 0;
        int b = 1;
        int buf;
        int i = 0;
        System.out.print(a + " " + b + " ");
        while (i <= 8) {
            buf = a;
            a = b;
            b = buf + b;
            System.out.print(b + " ");
            i++;
        }
    }
}
