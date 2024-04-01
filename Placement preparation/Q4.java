import java.util.Arrays;

 class Example {
    static void printOrder(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int j = arr.length - 1; j >= arr.length / 2; j--) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 10, 30, 40, 20};
        printOrder(arr);
 }
}
