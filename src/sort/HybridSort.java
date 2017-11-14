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
public class HybridSort implements Sorts {

    @Override
    public int sort(int[] A) {
        long t1, t2;
        t1 = System.nanoTime();
        recursiveMergeSort(A);
        t2 = System.nanoTime();
        return (int) (t2 - t1);
    }

    private void mergeSort(int[] array,int[] tempArray,int left,int right) {
        if(right-left>64){
            int middle = (left+right)/2;
            mergeSort(tempArray,array,left,middle);
            mergeSort(tempArray,array,middle+1,right);
            merge(tempArray,array,left,middle,right);
        }
        else{
            InsertionSort sort=new InsertionSort();
            sort.sort(array, left, right);
        }
    }

    private void swap(int[] a, int j, int i) {
        int t = a[j];
        a[j] = a[i];
        a[i] = t;
    }

    private void merge(int[] tempArray, int[] array, int left, int middle, int right) {
        System.arraycopy(array, left, tempArray, left, right-left+1);
        int i=left,j=middle+1;
        for(int k=left;k<=right;k++){
            if(i>middle){
                array[k]=tempArray[j++];
            }
            else if(j>right){
                array[k]=tempArray[i++];
            }
            else if(tempArray[j]<tempArray[i]){
                array[k]=tempArray[j++];
            }
            else{
                array[k]=tempArray[i++];
            }
        }
    }

    private void recursiveMergeSort(int[] A) {
        if(A==null){
            return;
        }
        int[] tempArray=new int[A.length];
        mergeSort(tempArray, A, 0, A.length-1);
    }
}
