public class Sort {

    static class Sth {
        int first;
        int second;
    }

    public static void swap(Sth[] arr, int i, int j) {
        /* This method simply takes an array
        and swaps its values at index i and j */

        Sort.Sth temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printA(Sth[] arr) {
        for (Sth j : arr) {
            System.out.println(j.first);
        }
    }
}
