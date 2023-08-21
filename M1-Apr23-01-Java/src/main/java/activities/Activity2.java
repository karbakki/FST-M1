package activities;

public class Activity2 {
    public static void main(String[] args) {

        int[] array = {10, 20, 34, 11, 10, 10, 20, 50,110};
        int count = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == 10)
                count++;
        }
        if (count == 3)
            System.out.println("true");

        else
            System.out.println("false");

    }
}
