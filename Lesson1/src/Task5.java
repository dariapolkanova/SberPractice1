public class Task5 {
    public static void main(String[] args) {
        int i = 2;
        int n = 100;
        System.out.println("Простые числа на промежутке от " + i + " до " + n + ":");
        while (i <= n) {
            int d = 2;
            while(i % d != 0) {
                d++;
            }
            if(d == i) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}
