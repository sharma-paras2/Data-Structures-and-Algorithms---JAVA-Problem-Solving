import java.util.Scanner;
public class NextGreatestElememy {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.print("enter the length of array ");
        n=sc.nextInt();
        int[] arr = new int[n];
        int[] grtarr =  new int[n];
        System.out.print("enter the elemts of array ");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int p, temp;
        p=arr.length;
        temp = arr[n-1];
        for(p=arr.length-1;p>=0;p--)
        {
           grtarr[p]= temp;
           temp = Math.max(temp, arr[p]);
        }
        System.out.println("Now The array will be ");
            for(int i=0;i<n;i++)
                 {
                   System.out.print(" "+grtarr[i]);
                 }


                 
                 
    }
}
