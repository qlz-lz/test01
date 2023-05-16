import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        int arr[]={2,588,888,1000,10000};
        Random r=new Random();
        int randomIndex;
        randomIndex=r.nextInt(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int temp;
            temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
