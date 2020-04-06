import java.util.Arrays;
public class newSorting {
    public static void main(String[] args) {
        int[] A = {3, 10, 1, 5, 2, 7, 4, 9, 8};
        int size = 4;
        newSorting(A, 4);
    }

    public static void newSorting(int[] A, int size) {
        int low = 0;
        int high = A.length - 1;
        if (A.length < size) {
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

            System.out.println(Arrays.toString(B));
            System.out.println(Arrays.toString(C));
            newSorting(B, size);
            newSorting(C, size);
            mergeSortedHalves(B, C);
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

    public static int[] mergeSortedHalves(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }
        while (i < A.length) {
            C[k] = A[i];
            i++;
            k++;
        }
        while (j < B.length) {
            C[k] = B[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(C));
        return C;
    }
}
