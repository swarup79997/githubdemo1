import java.util.Scanner;
public class Linearsearch{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,i,target,location=0;
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
                location=i+1;
                break;
            }
        }
        if(location>0){
            System.out.println(target+" found at location "+location);
        }
        else{
            System.out.println("Element not found");
        }
    }
}