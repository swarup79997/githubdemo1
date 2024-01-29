import java.util.Scanner;
class Dectooct{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,i;
        i=0;
        System.out.print("Enter Decimal number:");
        n=input.nextInt();
        int a[]=new int[n];
        while(n>0){
            a[i++]=n%8;
            n/=8;
        }
        System.out.print("Octal value:");
        for(i=i-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
}