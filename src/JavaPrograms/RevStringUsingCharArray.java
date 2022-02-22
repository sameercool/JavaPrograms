package JavaPrograms;

public class RevStringUsingCharArray {
    public static void main(String[] args) {
        String s="abcdefg";
        String rev="";
      char  a[]=s.toCharArray();
      for (int i=a.length-1;i>=0;i--){
          System.out.print(a[i]);
      }
    }
}
