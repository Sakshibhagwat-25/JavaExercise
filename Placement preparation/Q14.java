import java.util.Arrays;
class Demo{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,2,5,6,4};
        int[] result = removeDuplicate(arr);
        System.out.println("Array with duplicates removed: " + Arrays.toString(result));
    }
    public static int[] removeDuplicate(int[] arr){
        int[] temp=new int[arr.length];
        int n= arr.length;
        temp = new int[n];
        int j=0;

        for(int i=0; i<n; i++)
        {
            boolean isDuplicate = false;
            for(int k=0; k<j; k++){
            
            if(arr[i] == temp[k]){
                isDuplicate = true;
                break;
            }
        }
       if(!isDuplicate){
        temp[j++] = arr[i];
       }

        }
        int[] result = new int[j];
        System.arraycopy(temp, 0, result, 0, j);
        return result;
    }
    }
