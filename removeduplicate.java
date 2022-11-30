import java.util.Scanner;
public class removeduplicate
{
    public static int  remove(int []arr)
    {
        int n=arr.length;
        int j=0;
        int [] arr1=new int [n];
        if(n<=1)
        {
            return n;
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr1[j++]=arr[i];
            }
        }
        arr1[j++]=arr[n-1];
        for(int i=0;i<n;i++)
        {
            arr[i]=arr1[i];
        }
        return j;
    }
    public static void main (String []args)
    {
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        } 
        int ans= remove(arr);
        System.out.println(ans);

    }
}
