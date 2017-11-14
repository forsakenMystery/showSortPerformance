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
public class ShellSort implements Sorts {

    @Override
    public int sort(int[] A) {
        long t2, t1;
        t1 = System.nanoTime();
        for (int i = A.length / 2; i > 0; i /= 2) {
            for (int j = i; j < A.length; j++) {
                for (int k = j; k >= i && A[k] < A[k - i]; k -= i) {
                    swap(A, k, k - i);
                }
            }
        }
        t2 = System.nanoTime();
        return (int) (t2 - t1);
    }

    private void swap(int[] a, int j, int i) {
        int t = a[j];
        a[j] = a[i];
        a[i] = t;
    }
}