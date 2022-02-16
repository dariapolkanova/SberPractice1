public class Task4 {
    public static void main(String[] args) {
        System.out.print("Исходный массив: ");

        int a[] = new int[10];
        for (int i=0; i < a.length; i++) {
            a[i]=(int)Math.round(Math.random()*100);
            System.out.print(a[i] + " ");
        }

        int max = a[0];
        int min = a[0];
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(max < a[i]) {
                max = a[i];
            }
            if(min > a[i]) {
                min = a[i];
            }
            sum = sum+a[i];
        }
        double m = sum/a.length;

        System.out.println();
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Среднее значение элементов массива: " + m);
    }
}
