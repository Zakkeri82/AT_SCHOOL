
import java.util.Arrays;

public class TestSort {

    public static void testSort() {
        int [] arr = new int []{1, 2, 3, 4, 5};
        int [] arrCopy = arr.clone();
        int [] reverseArr = new int[] {5, 4, 3, 2, 1};

        if(Arrays.equals(Sort.reverseSort(arrCopy), reverseArr)) {
            System.out.println("Входной массив " + Arrays.toString(arr) + " на выходе "
                                + Arrays.toString(Sort.reverseSort(arrCopy)) + " true");
        } else {
            System.err.println("Входной массив " + Arrays.toString(arr) + " на выходе "
                                + Arrays.toString(arrCopy) + " false");
        }

        //еще одна проверка

        int [] massive = new int []{5, 4, 3, 2, 1};
        int [] massiveCopy = massive.clone();
        int [] reverseMassive = new int[] {5, 4, 3, 2, 1};

        if(Arrays.equals(Sort.reverseSort(massiveCopy), reverseMassive)) {
            System.out.println("Входной массив " + Arrays.toString(massive) + " на выходе "
                    + Arrays.toString(Sort.reverseSort(massiveCopy)) + " true");
        } else {
            System.err.println("Входной массив " + Arrays.toString(massive) + " на выходе "
                    + Arrays.toString(massiveCopy) + " false");
        }
    }

}
