package activities;


import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Activity4 {

    public static void main(String[] args) {
        int[] array = {22, 11, 44, 33, 55, 66, 88, 77, 99};

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = current;
        }

        printArray(array);
    }

    private static void printArray(int[] array) {
        for( int i=0; i<=array.length-1;i++){
            System.out.print(array[i] + " ");
        }
    }
}
