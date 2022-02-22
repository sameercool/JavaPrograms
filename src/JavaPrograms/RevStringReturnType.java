package JavaPrograms;

public class RevStringReturnType {
    public static void main(String[] args) {
       String s="abcdefg";
        System.out.println(recursivestring(s));
    }
    public static String recursivestring(String s){
if(s== null || s.length()<=1){
    return s;
}
return recursivestring(s.substring(1))+s.charAt(0);
    }
}
