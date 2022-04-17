import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @org.junit.jupiter.api.Test
    void sort() {
        int a[] = {2, 6, 8, 4, 3, 9, 7};
        Sort.bubbleSort(a,7);
    }
}