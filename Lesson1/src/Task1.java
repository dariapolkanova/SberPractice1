public class Task1 {
    public static void main(String[] args) {
        int a[] = new int[10];
        System.out.print("Исходный массив: ");
        for (int i=0; i < a.length; i++) {
            a[i]=(int)Math.round(Math.random()*100);
            System.out.print(a[i] + " ");
        }


        for (int i=0; i < a.length-1; i++) {
            for (int j=a.length-1; j > i; j--) {
                if(a[j] < a[j-1]) {
                    int c=a[j];
                    a[j] = a[j-1];
                    a[j-1] = c;
                }
            }
        }

        System.out.println();
        System.out.print("Отсортированный массив: ");
        for (int i=0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }
    }
}
