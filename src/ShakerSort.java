public class ShakerSort extends Sort{


    public static void sort(Sth[] arr) {

        // two pointer to trace ending and starting elements that we placed in every iteratetion
        int start = 0;
        int end = arr.length - 1;


        // when our starting pointer is bigger than end pointer, it means that our array is sorted.
        while (start <= end) {

            // docking to the end
            for (int i = start; i < end; i++) {
                if (arr[i].first > arr[i + 1].first) {
                    swap(arr, i, i + 1);
                }
            }
            end--;

            // docking to the start
            for (int i = end; i > start; i--) {
                if (arr[i].first < arr[i - 1].first) {
                    swap(arr, i, i - 1);
                }
            }
            start++;
        }

    }
}
