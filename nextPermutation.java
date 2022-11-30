import java.util.Scanner;
import java.util.Arrays;
public class nextPermutation 
{
    public static void permutation(int []arr)
    {
        int n=arr.length;
        for(int i=arr.length-2;i>=0;i--)
        {
            for(int j=arr.length-1;j>=i;j--)
            {
                if(arr[j]>arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    Arrays.sort(arr,i+1,n);
                    return ;
                }
            }
        }
        Arrays.sort(arr);
        return;
    }
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        System.out.println(arr);
    }
    
}
