package JavaPrograms;

import java.util.HashMap;

public class OccuranceOfChar {
    public static void main(String[] args) {
        HashMap<Character,Integer> m1=new HashMap<>();
        String s= "stringinput";
        s=s.replace(" ","");
        Integer count;
       char arr[]=s.toCharArray();
       for (int i=0;i<arr.length;i++){
           count =0;
           for (int j=0;j<arr.length;j++){
               if (arr[i]==arr[j]){
                   count ++;
               }
           }
           m1.put(arr[i],count);
       }

        System.out.println(m1);
    }

}
