public class A {
    public static void insert_Sort(Integer[] a) {
        if (a == null || a.length == 0) {
            return;
        }
        int i, j, temp;
        for (i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                temp = a[i];
                for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                    a[j + 1] = a[j];
                }
                a[j + 1] = temp;
            }
        }
    }
}