package SumCheck;
import java.util.Scanner;
public class SumCheck{
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("enter the numbers ");
        for(int i = 0;i<5;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<5;i++)
        {
            a=arr[i];
            b = 9-a;

           for(int j =i+1;j<5;j++)
           {
                if( arr[j]==b)
                {
                        System.out.println("the index are "+i+" "+j);
                }
           }
        }
        sc.close();;
    }
}