public class Task2 {
    public static void quickSort(int[] a, int left, int right) {
        if (a.length == 0)
            return;
        if (left >= right)
            return;
        int x = a[(left + right)/2];
        int i = left, j = right;
        while (i <= j) {
            while (a[i] < x) {
                i++;
            }
            while (a[j] > x) {
                j--;
            }

            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(a, left, j);

        if (right > i)
            quickSort(a, i, right);
    }

    public static void main(String[] args) {
        int a[] = new int[10];
        System.out.print("Исходный массив: ");
        for (int i=0; i < a.length; i++) {
            a[i]=(int)Math.round(Math.random()*100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int left = 0, right = a.length - 1;
        quickSort(a, left, right);
        System.out.print("Отсортированный массив: ");
        for (int i=0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
