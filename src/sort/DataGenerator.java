/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;


import java.util.Random;

public class DataGenerator {

    private static final DataGenerator dataGenerator = new DataGenerator();
    private final int min = Integer.MIN_VALUE;
    private final int max = Integer.MIN_VALUE;
    private Random rand = new Random();

    private DataGenerator() {
    }

    public static DataGenerator get() {
        return dataGenerator;
    }
    
    public static void show(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }

    public void generateIncreasing(int A[]) {
        A[0] = min + rand.nextInt(1000);
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i - 1] + rand.nextInt(1000);
        }
    }

    public void generateDecreasing(int A[]) {
        A[0] = max - rand.nextInt(1000);
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i - 1] - rand.nextInt(1000);
        }
    }

    public void gegenerateRandom(int A[]) {
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt();
        }
    }

    public void generateSame(int A[]) {
        A[0] = rand.nextInt();
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i - 1];
        }
    }
}
