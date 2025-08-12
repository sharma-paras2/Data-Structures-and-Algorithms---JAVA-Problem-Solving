import java.util.Scanner;
public class SumOfThree {
    public static void main(String[] args) {
         int[] arr = new int[5];
         
         Scanner scc= new Scanner(System.in);
         System.out.println("enter the elements of the array");
         for(int i = 0 ;i<5;i++)
         {
            arr[i]= scc.nextInt();
         }
         Boolean F = false;
         Outer :
         for(int i=0;i<5;i++)
                {
                  
            for(int j=0;j<5;j++)
             {
                
            for(int k=0;k<5;k++)
          { 
             if(arr[k]+arr[i]+arr[j]==10)
             {
                System.out.println("index are "+i+" "+j+" "+k);
                F = true;
                
                break Outer;
             }
                
          }

             }

                }

    }
   


}

