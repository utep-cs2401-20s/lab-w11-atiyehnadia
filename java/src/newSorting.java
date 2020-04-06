import java.util.Arrays;
public class newSorting {
    public static void main(String [] args){
        int[] A = {3, 10, 1, 5, 2, 7, 4, 9, 8};
        int size = 4;
        newSorting(A,size);
    }
    public static void newSorting(int[] A, int size) {
        if (A.length <= size) {
            int low = 0;
            int high = A.length - 1;

            quickSort(A, low, high);
        }
        else {
            int[] B = new int[(A.length / 2)];
            int[] C = new int[(A.length - B.length)];
            for (int i = 0; i < B.length; i++) {
                B[i] = A[i];
            }
            for (int i = 0; i < C.length; i++) {
                C[i] = A[i + B.length];
            }

            newSorting(B, size);
            newSorting(C, size);
            mergeSortedHalves(A, B, C);
        }
    }


    public static void quickSort(int[] A, int low, int high) {
        if (low < high) {
            int pi = partition(A, low, high);

            quickSort(A, low, pi - 1);
            quickSort(A, pi + 1, high);
        }
    }

    public static int partition(int[] A, int low, int high) {
        // using the first position as
        int i = low;
        int pivot = A[low];
        for (int j = low + 1 ; j <= high ; j++) {
            if (A[j] < pivot) {
                int temp = A[i + 1];
                A[i + 1] = A[j];
                A[j] = temp;
                i++;
            }
        }
        int temp = A[low];
        A[low] = A[i];
        A[i] = temp;
        return i;
    }

    public static void mergeSortedHalves(int[] A, int[] B, int [] C) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < B.length && j < C.length) {
            if (B[i] < A[j]) {
                A[k] = B[i];
                i++;
            } else {
                A[k] = C[j];
                j++;
            }
            k++;
        }
        while (i < B.length) {
            A[k] = B[i];
            i++;
            k++;
        }
        while (j < C.length) {
            A[k] = C[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(A));
    }
}
