public class Activity2 {
    public static void main (String[] args) {

        int[] array = {10,77,10,54,-11,10};

        int  counter =0;
        for ( int i=0; i <=array.length-1;i++){
            if(array[i] == 10){
                counter++;
            }

        }
        System.out.println(counter);
        if( counter == 3){
            System.out.println("Total 10 in array are 3 and count is 30 of those");
        } else
            System.out.println("Total 10 are not matched");
    }
}
