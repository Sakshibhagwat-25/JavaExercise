import java.util.Scanner;
class Example{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int n1=0,n2=1;
        System.out.print("Fibonacci series" + n + "th term:");

        for(int i=0;i<n;i++){
            int n3=n1+n2;
            System.out.print(n1 + "");
            n1=n2;
            n2=n3;
        }
    }
}