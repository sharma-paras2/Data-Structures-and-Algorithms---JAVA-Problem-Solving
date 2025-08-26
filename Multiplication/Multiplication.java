import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int[][] arr1  = new int[2][2];
        int[][] arr2  = new int[2][2];
        int[][] arr3  = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the elements of array 1 = ");
        for(int i = 0;i<arr1.length;i++)
        {
            for(int j =0;j<arr1[0].length;j++ )
            {
                arr1[i][j] = sc.nextInt();
            }
            
        }
        System.out.print("enter the elements of array 2 = ");
         for(int i = 0;i<arr2.length;i++)
        {
            for(int j =0;j<arr1[0].length;j++ )
            {
               arr2[i][j] = sc.nextInt();
            }
            
        }
            System.out.println();
        

         for(int i = 0;i<arr3.length;i++)
        {
            for(int j = 0;j<arr3[0].length;j++)
         {
            for(int p =0;p<arr2.length;p++)
            {
                 arr3[i][j] += arr1[i][p]*arr2[p][j]; 
            }
           
             
         }
        }
 for(int i = 0;i<arr2.length;i++)
        {
            for(int j =0;j<arr1[0].length;j++ )
            {
              System.out.print(arr3[i][j]+" ");
            }
            
        }
        sc.close();
    }
}
