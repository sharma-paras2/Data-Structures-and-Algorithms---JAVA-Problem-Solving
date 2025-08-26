package SwapArray;
import java.util.Scanner;
public class SwapArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        System.out.print("enter the elements of array");
        for(int i = 0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i,j;
        i=0;
        j=4;
       while (i<j) {
              int temp =arr[i];
              arr[i]=arr[j];
              arr[j]= temp;
              i++;
              j--;
       }
       System.out.println("the new array will be");
        for(int k = 0;k<5;k++)
        {
            System.out.print(" "+arr[k]);
        }
        sc.close();
    }

    
}
