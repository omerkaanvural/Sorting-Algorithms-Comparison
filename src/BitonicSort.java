public class BitonicSort extends Sort{

    public static void compareAndSwap(Sth[] arr, int i, int j, int dir)
    {
        if ( (arr[i].first > arr[j].first && dir == 1) ||
                (arr[i].first < arr[j].first && dir == 0))
        {
            // Swapping elements
            swap(arr, i, j);
        }
    }

    // bitonic merge provides making bitonic sequences part by part.
    public static void bitonicMerge(Sth[] arr, int low, int cnt, int dir)
    {
        if (cnt>1)
        {
            int k = cnt/2;
            for (int i=low; i<low+k; i++)
                compareAndSwap(arr,i, i+k, dir);
            bitonicMerge(arr,low, k, dir);
            bitonicMerge(arr,low+k, k, dir);
        }
    }

    // bitonic sort provides descending order of first half and ascending order of other half to send bitonic merge.
    public static void bitonicSort(Sth[] arr, int low, int cnt, int dir)
    {
        if (cnt>1)
        {
            int k = cnt/2;

            // sort in ascending order since dir here is 1
            bitonicSort(arr, low, k, 1);

            // sort in descending order since dir here is 0
            bitonicSort(arr,low+k, k, 0);

            bitonicMerge(arr, low, cnt, dir);
        }
    }

    // general sort method
    public static void sort(Sth[] arr, int n, int up)
    {
        bitonicSort(arr, 0, n, up);
    }
}
