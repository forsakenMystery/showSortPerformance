/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author FORSAKEN MYSTERY
 */
public class InsertionSort implements Sorts {

    @Override
    public int sort(int[] A) {
        long t2, t1;
        t1 = System.nanoTime();
            for (int j = 1; j < A.length; j++) {
                for (int k = j; k >= 1 && A[k] < A[k - 1]; k --) {
                    swap(A, k, k - 1);
                }
            }
        t2 = System.nanoTime();
        return (int) (t2 - t1);
    }
    public void sort(int[] A,int left,int right) {
            for (int j = left+1; j < right; j++) {
                for (int k = j; k > left && A[k] < A[k - 1]; k --) {
                    swap(A, k, k - 1);
                }
            }
    }
    private void swap(int[] a, int j, int i) {
        int t = a[j];
        a[j] = a[i];
        a[i] = t;
    }

}
