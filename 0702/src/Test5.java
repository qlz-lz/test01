import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        int prize[]={2,588,888,1000,10000};
        int newPrize[]=new int[prize.length];
        Random r=new Random();
        for (int i = 0; i < prize.length;) {
            int index;
            index=r.nextInt(prize.length);
            int money=prize[index];
            boolean flag=contains(newPrize,money);
            if(!flag) {
                System.out.println(money);
                newPrize[i]=money;
                i++;
            }
        }
    }


    public static boolean contains(int []arr,int prize)
    {
        for (int i = 0; i < arr.length; i++) {
            if(prize==arr[i])
            {
                return true;
            }
        }
        return false;
    }

}
