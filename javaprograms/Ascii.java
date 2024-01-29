public class Ascii{
    public static void main(String[] args) {
      String myStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()_+:;{}|[]<>,./?'";
      int i,a;
      for(i=0;i<myStr.length();i++){
      char result = myStr.charAt(i);
      a=result;
      System.out.println(result+" "+a);
      }
    }
  }