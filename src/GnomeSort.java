public class GnomeSort extends Sort{

    public static void sort(Sth[] arr) {


        //Gnome sort is like bubble sort
        // The difference is you can iterate reversely after you placed last element.

        int arrSize = arr.length;
        int i = 0;

        while (i < arrSize) {
            if ((i == 0) || (arr[i].first >= arr[i-1].first)) {
                i++;
            }

            else {

                swap(arr, i, i-1);
                i--;
            }

        }

    }

}
