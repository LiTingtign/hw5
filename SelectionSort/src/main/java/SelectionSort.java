public class SelectionSort {
    public static void selectSort(int[] arr) {
        // 空数组 或 只有一个元素的数组，则什么都不做。
        if (arr == null || arr.length == 1) return;

        // 外层循环的 i 表示无序区的第一个元素的索引。
        for (int i = 0; i < arr.length - 1; i++) {
            // minIndex是最小元素的索引。
            int minIndex = i;
            // 找到最小元素的索引值，赋给minIndex.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 交换元素
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }
}
