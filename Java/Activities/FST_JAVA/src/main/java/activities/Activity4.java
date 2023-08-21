package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main (String args[]){
        int[] data = {9,2,5,6,7,8,4};
        insertionSort(data);
        System.out.println("Sorted array in ascending ordr:");
        System.out.println(Arrays.toString(data));
    }
    static void insertionSort(int array[]){
        int size = array.length,i;
        for (i=1;i<size;i++){
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
        }
    }

