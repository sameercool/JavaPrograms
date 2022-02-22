package JavaPrograms;

public class RemovJunkCharFromString {
    public void junk(){
        String s="@#$% Sameer #$@$@@";
        //we will remove garbage characters using regular expression
        //regular expression [^a-zA-Z0-9]
        //^ this is not symbol in regex
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
    public static void main(String[] args) {
        RemovJunkCharFromString r1=new RemovJunkCharFromString();
        r1.junk();
    }
}
