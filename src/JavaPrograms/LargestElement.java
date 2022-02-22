package JavaPrograms;

public class LargestElement {
    public static void main(String[] args) {
        int ar[]={4,3,5,6,6,8,9};
        int max=ar[0];
        for (int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        System.out.println(max);

    }
}
