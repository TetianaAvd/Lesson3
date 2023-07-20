import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[200];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(500);
        }

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println( );

        boolean unsorted = true;
        int temp;
        int n = array.length;

        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                    System.out.print(array[i] + " ");
                }
            }
            n--;
        }
    }
}



