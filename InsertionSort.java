import java.util.Random;
public class InsertionSort {
    public static void insertionSort(int[] arr){
        System.out.print("\nOriginal Array: ");
        for (int i : arr)
            System.out.print(i + " ");

        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        System.out.print("\nSorted Array: ");
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr1 = new int[6];
        int[] arr2 = new int[100];
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
                17, 18, 19, 20, 21, 22, 24, 23};
        int[] arr4 = {19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5,
                4, 3, 2, 1};

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(50);
        }
        insertionSort(arr1);

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextInt(100);
        }
        insertionSort(arr2);

        insertionSort(arr3);
        insertionSort(arr4);
    }
}
