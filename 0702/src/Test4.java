import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("加密or解密 Input " + "1" + "or" + "2");
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        boolean flag = false;
        for (; flag == false; ) {
            if (choice == 1) {
                jiami();
                flag = true;
            } else if (choice == 2) {
                jiemi();
                flag = true;
            } else {
                System.out.println("数据不合法，重新录入");
                choice = 0;
                choice = sc.nextInt();
            }
        }
    }
    public static void jiami()
    {
        int password;
        System.out.println("Input");
        Scanner sc=new Scanner(System.in);
        password=sc.nextInt();
        int arr[]=getArr(password);
        int arr2[]=add(arr);
        int arr3[]=rem(arr2);
        int arr4[]=newArr(arr3);
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i]);
        }
        System.out.println();
        int result;
        result=getNum(arr4);
       // for (int i = 0; i < arr4.length; i++) {
       //     result=result*10+arr[i];
     //   }
        System.out.println(result);
    }
    public static void jiemi()
    {
        System.out.println("输入被加密密码串");
        int result;
        Scanner sc=new Scanner(System.in);
        result=sc.nextInt();
        int arr[]=getArr(result);
        int arr2[]=newArr(arr);
        int arr3[]=untirem(arr2);
        int arr4[]=untiadd(arr3);
        int finalResult;
        finalResult=getNum(arr4);
        System.out.println(finalResult);
    }


    public static int[] getArr(int password)
    {
        int index;
        index=0;
        int temp;
        temp=password;
        for(;temp !=0;)
        {
            index++;
            temp=temp/10;
        }
        int arr[]=new int[index];
        for (int i = arr.length-1; i >=0; i--) {
            arr[i]=password%10;
            password=password/10;
        }
        return arr;
    }
    public static int[] add(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+5;
        }
        return arr;
    }
    public static int[] rem(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]%10;
        }
        return arr;
    }
    public static int[] newArr(int [] arr)
    {
        int arr2[]=new int[arr.length];
        int index;
        index=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            arr2[index]=arr[i];
            index--;
        }
        return arr2;
    }
    public static int[] untirem(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0&&arr[i]<=4)
            {
                arr[i]=arr[i]+10;
            }
        }
        return arr;
    }
    public static int[] untiadd(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]-5;
        }
        return arr;
    }
    public static int getNum(int []arr)
    {
        int result;
        result=0;
        for (int i = 0; i < arr.length; i++) {
            result=result*10+arr[i];
        }
        return result;
    }
}
