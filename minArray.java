import java.util.Scanner; 
public class minArray
{
    public static int min (int[]arr)
    {
        int n=arr.length, MIN_Ele=Integer.MAX_VALUE;
       for(int i=0;i<n;i++)
       {
          MIN_Ele=Math.min(MIN_Ele,arr[i]);
       }
       return MIN_Ele;
    }
    public static void main(String []args)
    {
        Scanner scn= new Scanner (System.in);
        int n=scn.nextInt();
        int []arr=new int [n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn. nextInt();
        }
        int saksham=min (arr);
        System.out.println(saksham);
        min(arr);
    }
}