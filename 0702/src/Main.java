import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char chSmall;
        chSmall='a';
        char chBig;
        chBig='A';
        char chArr[]=new char[26*2];
        for (int i = 0; i < chArr.length; i++) {
            if (i <= 25) {
                chArr[i] = chSmall;
                chSmall++;
            } else {
                chArr[i] = chBig;
                chBig++;
            }
        }
        String result="";
        int num;
        Random r=new Random();
        num=r.nextInt(10);
        int index;
        for (int i = 0; i < 4; i++) {
            index=r.nextInt(chArr.length);
            result=result+chArr[index];
           // System.out.print(chArr[index]);
        }
       // System.out.println(num);
        result=result +num;
        System.out.println(result);
    }
}
