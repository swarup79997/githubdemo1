import java.util.Scanner;
class Matrix{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,j,m,n;
        System.out.println("Enter no:of rows:");
        m=input.nextInt();
        System.out.println("Enter no:of columns:");
        n=input.nextInt();
        System.out.println("Enter "+(m*n)+" values:");
        int a[][]=new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("Matrix is:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}