import java.util.Scanner;
public class maxArray
{
    public static int max(int[]arr)
    {
        int n = arr.length  , maxEle = Integer.MIN_VALUE ;
        for(int i=0; i<n; i++)
        {
        maxEle = Math.max(maxEle,arr[i]);
        }
        return(maxEle);
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int[] arr = new int[n]; 
        for (int i =0 ; i < arr.length; i++)
        {
        arr[i]=scn.nextInt(); 
        }
        int gulafshan = max(arr);
        System.out.println(gulafshan);
        max(arr);
    }

}
