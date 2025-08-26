package ZeroOne;
import java.util.Scanner;
public class ZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n=0;
        
          System.out.print("enter the length of array");
          n=sc.nextInt();
          int[] arr= new int[n];
        System.out.print("enter the elements of array");
       
        for(int i = 0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i,j;
        i=0;
        j=arr.length - 1;
       while (i<j) {
                if(arr[i]== 1 && arr[j]==1)
                {
                    j--;
                }
                else if(arr[i]==1 && arr[j]== 0)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
                else if(arr[i]== 0 && arr[j]==1)
                {
                        i++;
                        j--;
                }
       }
       System.out.print("the new array will be");
        for(int k = 0;k<n;k++)
        {
            System.out.print(" "+arr[k]);
        }
        sc.close();
    }

    
}
