import java.util.Scanner;
class Example{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it's a palindrome:");
        int num=sc.nextInt();
        int originalNum=num;
        int reversedNum=0;
        
        while(num>0){
            int reminder=num % 10;
            reversedNum = reversedNum*10+reminder;
            num = num/10;

        }
        if(originalNum == reversedNum){
            System.out.println(originalNum + " is a palindrome.");
        }
        else{
            System.out.println(originalNum + " is not a palindrome.");
        
        }
    }
}