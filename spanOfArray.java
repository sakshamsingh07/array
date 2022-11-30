import java .util.Scanner; 
public class spanOfArray
{ 
    public static Scanner scn = new Scanner(System.in);
    // public static void takeinput(int [] arr)
    // {
    //      int n = arr.length;
    //     for(int i=0; i<n; i++)
    //     {
    //     arr[i]= scn.nextInt();
    //     }
    // }
    public static int max(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++ )
        {
            max= Math.max (max,arr[i]);
        }
        return (max);
    }
    public static int min(int[] arr)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++ )
        {
            min= Math.min (min,arr[i]);
        }
        return (min);
    }
    
    public static void main(String[] args) // throws Exception
    {
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i =0 ; i<arr.length; i++)
        {
            arr[i]= scn.nextInt();
        }
        int span =(max(arr)-min(arr));
        System.out.println(span);
    } 

}