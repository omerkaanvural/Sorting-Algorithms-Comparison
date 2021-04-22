public class CombSort extends Sort{
    public static void sort(Sth[] arr) {

        // the key thing is this constant which is optimal integer to compare efficiently in every dividing process
        final double cons = 1.3;
        int arrSize = arr.length;

        // gap means is length / our constant. It provides us that we compare elements from far to close step by step
        int gap = arr.length;

        while(gap > 1) {
            gap = (int)(gap / cons);

            int i = 0;
            while (i + gap < arrSize) {
                if (arr[i].first > arr[i + gap].first) {
                    swap(arr, i, i + gap);
                }
                ++i;
            }

        }
        //printA(arr);

    }


}
