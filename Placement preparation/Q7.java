import java.util.ArrayList;
import java.util.List;
class Demo{
    public static void main(String args[]){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        List<Integer>commonElements = findCommonElements(arr1,arr2);
        System.out.println("Common elements:" + commonElements);

    }
    public static List<Integer> findCommonElements(int[] arr1,int[] arr2){
        List<Integer> common = new ArrayList<>();
        for(int num:arr1){
            for(int otherNum:arr2){
                if(num == otherNum){
                    common.add(num);
                    break;
                }
            }
        }
        return common;
    }
}