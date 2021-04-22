public class StoogeSort extends Sort{

    public static void sort(Sth[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(Sth[] array, int i, int j) {
        if(array[i].first > array[j].first) {
            swap(array, i , j);
        }
        if(j - i + 1 > 2) {
            int t = (int) Math.floor((j - i + 1) / 3);
            // first 2/3 part
            sort(array, i, j - t);
            // last 2/3 part
            sort(array, i + t, j);
            // first 2/3 part again
            sort(array, i, j - t);
        }
    }
}
