import java.util.Random;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        int arr[]=createArr();
        int userInputnumber[]=userInputNumber();
        for (int i = 0; i < userInputnumber.length; i++) {
            System.out.print(userInputnumber[i]+" ");
        }
        System.out.println();
        int redConut;
        int blueCount;
        redConut=0;
        blueCount=0;
        for (int i = 0; i < userInputnumber.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(userInputnumber[i]==arr[j])
                {
                    redConut++;
                    break;
                }
            }
        }
        if(userInputnumber[userInputnumber.length-1]==arr[arr.length-1])
        {
            blueCount++;
        }
      //  System.out.println("blueCount"+blueCount+" "+"redConut"+redConut);
        if(redConut==6&&blueCount==1)
        {
            System.out.println("1000w");
        }
        else if (redConut==6&&blueCount==0)
        {
            System.out.println("500w");
        }
        else if (redConut==5&&blueCount==1)
        {
            System.out.println("3000");
        }
        else if ((redConut==5&&blueCount==0)||redConut==4&&blueCount==1)
        {
            System.out.println("200");
        }
        else if ((redConut==4&&blueCount==1)||redConut==3&&blueCount==1)
        {
            System.out.println("10");
        }
        else if (((redConut==2&&blueCount==1)||redConut==1&&blueCount==1)||redConut==0&&blueCount==1)
        {
            System.out.println("5");
        }
        else
        {
            System.out.println("Thanks");
        }
        System.out.println("===================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("===================");
    }


    public static int[] createArr()
    {
        int arr[]=new int [7];
        int conArr[]=new int[arr.length];
        Random r=new Random();
        for (int i = 0; i < arr.length-1; ) {
            arr[i]=r.nextInt(33)+1;
            boolean flag;
            flag=contains(conArr,arr[i]);
            if(!flag)
            {
                conArr[i]=arr[i];
                i++;
            }
        }
        arr[arr.length-1]= r.nextInt(16)+1;
        return arr;
    }
    public static int[] userInputNumber()
    {
        int userInputNumber[]=new int[7];
        int userInputNumberNew[]=new int[userInputNumber.length];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < userInputNumber.length-1; ) {
            System.out.println("输入第" + (i + 1) + "个红球号码");
            userInputNumber[i] = sc.nextInt();
            boolean flag;
            flag = contains(userInputNumberNew, userInputNumber[i]);
            if (userInputNumber[i] <= 33 && userInputNumber[i] >= 1) {
                if (!flag) {
                    userInputNumberNew[i] = userInputNumber[i];
                    i++;
                } else {
                    System.out.println("数据不合法，错误为：数据重复");
                }
            }
            else
            {
                System.out.println("数据不合法，错误类型为：数据范围异常");
            }
        }
        while (true)
        {
            System.out.println("输入蓝球号码");
            userInputNumber[userInputNumber.length-1]=sc.nextInt();
            if(userInputNumber[userInputNumber.length-1]<=16&&userInputNumber[userInputNumber.length-1]>=1)
            {
                break;
            }
        }
        return userInputNumber;
    }

    public static boolean contains(int arr[],int number)
    {
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number)
            {
                return true;
            }
        }
        return flag;
    }
}
