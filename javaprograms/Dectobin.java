import java.util.Scanner;
class Dectobin{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,i;
        i=0;
        System.out.println("Enter Decimal number:");
        n=input.nextInt();
        int a[]=new int[n];
        while(n>0){
            a[i++]=n%2;
            n/=2;
        }
        System.out.println("Binary value:");
        for(i=i-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
}