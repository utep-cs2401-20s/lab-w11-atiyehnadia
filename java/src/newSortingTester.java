import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class newSortingTester {

    // Tests the normal functionality  of the newSorting method, and tests how many times the array will partition,
    // and recursively quick sort before returning the sorted array
    // Input:  {3, 10, 1, 5, 2, 7, 4, 9, 8}
    // Size: 4  * Since size of array is 9, size test how it is used within the method to split the array*
    // Output: {1, 2, 3, 4, 5, 7, 8, 9, 10}
    // Pass/Fail: PASS


    @Test
    public void newSortingTester1() {
        int[] A = {3, 10, 1, 5, 2, 7, 4, 9, 8};
        int size = 4;
        newSorting.newSorting(A, size);
        int[] B = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        assertArrayEquals(B, A);
    }


    //Tests again the normal functionality of the newSorting method, when the array is the same length than the size
    // and will only be called once in the base case, and then returning the sorted array.
    // Input: {7, 20, 2, 3, 1, 5}
    // Size: 6  * Since size of array is 6, size will not split the array*
    // Output: {1, 2, 3, 5, 7, 20}
    //Pass/Fail: PASS

    @Test
    public void newSortingTester2(){
        int[] A = {7, 20, 2, 3, 1, 5};
        int size = 6;
        newSorting.newSorting(A, size);
        int[] B = {1, 2, 3, 5, 7, 20};
        assertArrayEquals(B, A);

    }

    //Tests the functionality of the newSorting method, when the array has negative and duplicated numbers
    // The array is also partially sorted and test will see how the method handles this.
    // Input: {3, 5, 6, 20, 30, -6, 1, 1, -30}
    // Size: 3    * Since size of array is 9, size will split the array into 3 equal parts*
    // Output: {-30, -6, 1, 1, 3, 5, 6, 20, 30}
    // Pass/Fail: PASS

    @Test
    public void newSortingTester3(){
        int [] A = {3, 5, 6, 20, 30, -6, 1, 1, -30};
        int size = 3;
        newSorting.newSorting(A, size);
        int [] B = {-30, -6, 1, 1, 3, 5, 6, 20, 30};
        assertArrayEquals(B, A);
    }

    //Tests the functionality of the newSorting method with a larger array, and other cases like negative
    // duplicated numbers and larger numbers
    // Input: {5, 203, -80, 1300, 1300, 4200, 5, -1, 0, 1, 0, 3, 2, 9, 0, 80, -1300, 200, 90, 2000}
    // Size: 4  * Since size of array is 20, size will split the array into 5 equal parts*
    // Output: {-1300, -80, -1, 0, 0, 0, 1, 2, 3, 5, 5, 9, 80, 90, 203, 1300, 1300, 2000, 4200}
    // Pass/Fail: PASS

    @Test
    public void newSortingTester4(){
        int [] A = {5, 203, -80, 1300, 1300, 4200, 5, -1, 0, 1, 0, 3, 2, 9, 0, 80, -1300, 200, 90, 2000};
        int size = 6;
        newSorting.newSorting(A, size);
        int [] B = {-1300, -80, -1, 0, 0, 0, 1, 2, 3, 5, 5, 9, 80, 90, 200, 203, 1300, 1300, 2000, 4200};
        assertArrayEquals(B, A);

    }

    //Tests the functionality of the newSorting method when the array is already sorted and does not require
    // any passes of the quickSort helper method.
    // Input: { 1, 2, 3, 3, 5, 7, 9, 10}
    // Size: 2  * Since size of array is 8, size will split the array into 4 equal parts*
    // Output: { 1, 2, 3, 3, 5, 7, 9, 10}
    // Pass/Fail: PASS

    @Test
    public void newSortingTester5(){
        int [] A = {1, 2, 3, 3, 5, 7, 9, 10};
        int size = 2;
        newSorting.newSorting(A, size);
        int [] B = {1, 2, 3, 3, 5, 7, 9, 10};
        assertArrayEquals(B, A);
    }

    //Test how the method reacts to an empty array
    // EDGE CASE
    // Input: {}
    // Size: 0
    // Output: {}
    // Pass/Fail: PASS

    @Test
    public void newSortingTester6(){
        int [] A = {};
        int size = 0;
        newSorting.newSorting(A, size);
        int [] B = {};
        assertArrayEquals(B, A);
    }

}
