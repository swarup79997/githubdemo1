import java.util.Scanner;
class Dectohex{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,r;
        System.out.println("Enter Decimal number:");
        n=input.nextInt();
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n>0){
            r=n%16;
            hex=hexchars[r]+hex;
            n/=16;
        }
        System.out.println("HexaDecimal value: "+hex);
    }
}