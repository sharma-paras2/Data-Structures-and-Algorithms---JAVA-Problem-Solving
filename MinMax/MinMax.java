package MinMax;
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("add elements ");
        for(int i =0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("the array is ");
        for(int i =0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
         
        int min=arr[0];
        int max=arr[0];
        for(int i =0;i<5;i++)
        {
            min = Math.min(min,arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println(" min elemet is "+min);
        System.out.println(" the max elemet is "+max);

        sc.close();
    }
}