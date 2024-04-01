class Demo{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        rotateLeft(arr);
        System.out.println("Array after rotating left by 1 position:");
        for(int num : arr){
            System.out.print(num + "");
        }
    }
    public static void rotateLeft(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = temp;
    }
}