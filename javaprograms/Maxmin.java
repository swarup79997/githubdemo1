import java.util.Scanner;
class Maxmin{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,j,n,max=0,min=0;
        System.out.println("Enter the no:of Elements:");
        n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Elements:");
        for(i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println("Elements are:");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
        max=a[0];
        min=a[0];
        for(i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Maximum is: "+max);
        System.out.println("Minimum is: "+min);
    }
}