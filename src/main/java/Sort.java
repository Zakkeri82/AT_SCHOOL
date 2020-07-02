public class Sort {

    /**
     * Метод сортировки массива в убывающем порядке
     * @param arr - массив, который приходит на вход
     * @return отсортированный массив
     */
    public static int[] reverseSort(int[] arr) {
        int t;
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 1; j < arr.length; j++) {
                if (arr[j] > arr[j - 1]) {
                    t = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = t;
                }
            }
        }

        return arr;
        // Создать массив, наполнить его числами в возрастающем порядке
        // Необходимо вернуть массив отсортированный в убывающем порядке
    }
}