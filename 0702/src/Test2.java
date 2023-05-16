import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        double grade[]=new double[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Input");
        for (int i = 0; i < grade.length; i++) {
            grade[i]=sc.nextInt();
            if(grade[i]>100||grade[i]<0)
            {
                System.out.println("数据不合法");
                i--;
                continue;
            }
        }
        double max;
        max=getMax(grade);
        double min;
        min=getMin(grade);
        double sum;
        sum=0;
        for (int i = 0; i < grade.length; i++) {
            if(grade[i]==min||grade[i]==max)
            {
                continue;
            }
            sum=sum+grade[i];
        }
        System.out.println(sum/4);
    }
    public static double getMax(double[] grade)
    {
        double max=grade[0];
        for (int i = 0; i < grade.length; i++) {
            if(max<grade[i])
            {
                max=grade[i];
            }
        }
        return max;
    }
    public static double getMin(double[] grade)
    {
        double min=grade[0];
        for (int i = 0; i < grade.length; i++) {
            if(min>grade[i])
            {
                min=grade[i];
            }
        }
        return min;
    }
}
