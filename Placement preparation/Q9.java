import java.util.Scanner;

class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int missingNumber = findMissingNumber(array);

        System.out.println("Missing number: " + missingNumber);

    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        return totalSum - arrSum;
    }
}
