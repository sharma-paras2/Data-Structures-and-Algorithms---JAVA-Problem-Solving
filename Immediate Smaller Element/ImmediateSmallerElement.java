import java.util.Scanner;

public class ImmediateSmallerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4,3,1,5,2};
          for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                arr[i]=arr[i+1];
            }
            else
            {
                arr[i]=-1;
            }
        }
        arr[4]=-1;
        for(int i =0;i<arr.length;i++)
        {
                System.out.print(arr[i]+ " ");
        }
            
        sc.close();
    }
    
}
