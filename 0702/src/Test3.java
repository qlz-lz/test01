import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int index;
        Scanner sc=new Scanner(System.in);
        System.out.println("输入密码位数");
        index=sc.nextInt();
        int arr[]=new int[index];
        System.out.println("输入密码");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int newArr1[]=new int[arr.length];
        newArr1=add(arr);
        int newArr2[]=new int[arr.length];
        newArr2=rem(newArr1);
        int newArr3[]=new int[arr.length];
        newArr3=newArr(newArr2);
        for (int i = 0; i < newArr3.length; i++) {
            System.out.print(newArr3[i]);
        }
        System.out.println();
        int password;
        password=0;
        for (int i = 0; i < newArr3.length; i++) {
            password=password*10+newArr3[i];
        }
        System.out.println(password);
    }
    public static int[] add(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+5;
        }
        return arr;
    }
    public static int[] rem(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]%10;
        }
        return arr;
    }
    public static int[] newArr(int [] arr)
    {
        int newArr[]=new int[arr.length];
        int index;
        index=0;
        for (int i = arr.length-1; i >=0; i--) {
            newArr[index]=arr[i];
            index++;
        }
        return newArr;
    }
}
