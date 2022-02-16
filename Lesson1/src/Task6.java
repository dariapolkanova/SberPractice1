public class Task6 {
    public static void main(String[] args) {
        int i = 1;
        char ch = 42;
        while (i <= 15) {
            System.out.print(ch);
            if (i % 5 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
