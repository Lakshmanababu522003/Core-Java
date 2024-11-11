import java.util.Arrays;

class problem4 {

    public static void main(String[] args) {

        int arr[] = new int[] { 0,1,0,3,12};
        int count = 1;

        System.out.println(Arrays.toString(arr));

        problem4 zero = new problem4();
        arr = (zero.displayArrzero(arr, count));

        System.out.println(Arrays.toString(arr));

    }

    int[] displayArrzero(int[] arr, int count) {
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == 0) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            }
        }

        problem4 zero1 = new problem4();

        if (count < arr.length / 2) {
            count++;
            zero1.displayArrzero(arr, count);

        }

        return arr;

    }

}

// [5, 3, 0, 6, 0, 0, 7]
// [5, 3, 6, 7, 0, 0, 0]