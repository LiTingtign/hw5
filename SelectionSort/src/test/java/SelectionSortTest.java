import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void selectSort() {
        int[] arr = {6, 9, 1, 4, 5, 8, 7, 0, 2, 3};

        System.out.print("排序前:  ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        SelectionSort.selectSort(arr);

        System.out.print("排序后:  ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}