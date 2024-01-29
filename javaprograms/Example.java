import java.util.Scanner;
public class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,i,target,count=0;
        System.out.println("Enter no:of Elements:");
        n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Elements:");
        for(i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        System.out.println("Elements are:");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nEnter your Target value:");
        target=input.nextInt();
        for(i=0;i<n;i++){
            if(target==a[i]){
                count=count+1;
            }
        }
        if(count>0){
            System.out.println(target+" repeated "+count+" times");
        }
        else{
            System.out.println("Element not found");
        }
    }
}