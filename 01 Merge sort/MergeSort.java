import java.util.Scanner;

public class MergeSort {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr1 = {11,22,33,44};
    int[] arr2 = {12,24,34,46};
    int[] arr3 = new int[8];
    int i ,j, k;
    i=0;
    j=0;
    k=0;
    while(i<arr1.length && j<arr2.length)
    {
            if(arr1[i]<arr2[j])
            {
                arr3[k] = arr1[i];
                i++;
                k++;
            }
             else 
            {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
    }

    if(i==arr1.length)
    {
        while (j<arr2.length) {
            arr3[k]= arr2[j];
            j++;
            k++;
            
        }
    }
    if(j==arr2.length)
    {
        while (i<arr1.length) {
            arr3[k]= arr2[i];
            i++;
            k++;
            
        }
    }
    for(int p=0;p<8;p++)
    {
        System.out.print(" "+arr3[p]);
    }
    sc.close();
}
    
}