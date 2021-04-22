import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        int n = 128;
        Sort.Sth[] array = new Sort.Sth[n];
        Sort.Sth[] array2 = new Sort.Sth[n];
        Sort.Sth[] array3 = new Sort.Sth[n];
        Sort.Sth[] array4 = new Sort.Sth[n];
        Sort.Sth[] array5 = new Sort.Sth[n];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            Sort.Sth sth = new Sort.Sth();
            sth.first = rand.nextInt(10000);
            sth.second = i;
            array[i] = sth;
            array2[i] = sth;
            array3[i] = sth;
            array4[i] = sth;
            array5[i] = sth;
        }


        // BITONIC SORT

        BitonicSort bs = new BitonicSort();
        long nano_startTime = System.nanoTime();
        bs.sort(array, array.length, 1);
        long nano_endTime = System.nanoTime();
        System.out.println("Time taken in nano seconds with bitonic: "
                + (nano_endTime - nano_startTime));


        // SHAKER SORT

        ShakerSort ss = new ShakerSort();
        long startTime1 = System.nanoTime();
        ss.sort(array2);
        long endTime1 = System.nanoTime();
        System.out.println("Time taken in nano seconds with shaker: "
                + (endTime1 - startTime1));


        // GNOME SORT

        GnomeSort gs = new GnomeSort();
        long startTime2 = System.nanoTime();
        gs.sort(array3);
        long endTime2 = System.nanoTime();
        System.out.println("Time taken in nano seconds with gnome: "
                + (endTime2 - startTime2));

        //COMBSORT

        CombSort cs = new CombSort();
        long startTime3 = System.nanoTime();
        cs.sort(array4);
        long endTime3 = System.nanoTime();
        System.out.println("Time taken in nano seconds with combsort: "
                + (endTime3 - startTime3));


        //STOOGE SORT

        StoogeSort sts = new StoogeSort();
        long startTime4 = System.nanoTime();
        sts.sort(array5);
        long endTime4 = System.nanoTime();
        System.out.println("Time taken in nano seconds with stooge: "
                + (endTime4 - startTime4));

    }
}
