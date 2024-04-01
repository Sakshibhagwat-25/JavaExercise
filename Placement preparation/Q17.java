import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        if(isArmstrong(num)){
            System.out.println(num + " is an Armstrong number");
        }
        else{
           System.out.println(num + " is not an Armstrong number"); 
        }
    }
    public static boolean isArmstrong(int num){
        int sum=0;
        int originalNum=num;
        while(num>0){
            int digit=num%10;
            sum += Math.pow(digit, 3);
            num/=10;
        }
        return sum == originalNum;
    }
}