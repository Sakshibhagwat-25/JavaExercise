import java.util.Arrays;
class Demo{
    static void rotateArray(int[] arr, int k){
        int n = arr.length;
        int[] rotatedArray = new int[n];
        for(int i=0; i<n; i++){
            int newIndex = (i + k)%n;
            rotatedArray[newIndex]=arr[i];
        }

            System.arraycopy(rotatedArray, 0, arr, 0, n);
        }
     public static void main(String args[]){
            int[] arr = {1,2,3,4,5};
            int k = 2;
            System.out.println("Original array:" + Arrays.toString(arr));
            rotateArray(arr,k);
            System.out.println("Array after rotating by " + k + "positions:" +Arrays.toString(arr));
        }
    }