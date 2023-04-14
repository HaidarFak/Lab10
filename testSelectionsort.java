/*
* testSelectionSort.java
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
public testSelectionSort() {
}
public void testPositive(){
int[] arr = new int[5];
arr[0] = 8;
arr[1] = 9;
arr[2] = 7;
arr[3] = 10;
arr[4] = 2;
int[] Sortedarr = new int[5];
Sortedarr[0] = 2;
Sortedarr[1] = 7;
Sortedarr[2] = 8;
Sortedarr[3] = 9;
Sortedarr[4] = 10;
	int[] arr = {-8, -9, -7, -10, -2};
    int[] sortedArr = {-10, -9, -8, -7, -2};
    SelectionSort.selectionSort(arr);
    assertArrayEquals(sortedArr, arr);
}
public void testNegative(){
	int[] arr = {-8, -9, -7, -10, -2};
    int[] sortedArr = {-10, -9, -8, -7, -2};
    SelectionSort.selectionSort(arr);
    assertArrayEquals(sortedArr, arr);
}
public void testMixed(){
	int[] arr = {8, -9, 0, 10, -2};
    int[] sortedArr = {-9, -2, 0, 8, 10};
    SelectionSort.selectionSort(arr);
    assertArrayEquals(sortedArr, arr);
}
public void testDuplicates(){
int[] arr = {8, 9, 7, 10, 2, 2, 7, 8};
    int[] sortedArr = {2, 2, 7, 7, 8, 8, 9, 10};
    SelectionSort.selectionSort(arr);
    assertArrayEquals(sortedArr, arr);
}
}
