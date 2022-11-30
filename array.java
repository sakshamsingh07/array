import java.util.Scanner; 
public class array 
{
    public static Scanner scn = new Scanner (System.in);
    public static void takeinput(int [] arr)                                                              
    {
        for(int i =0 ; i<arr.length; i++)
        {
            arr[i]= scn.nextInt();  //setter
        }
    }
    public static void printarray(int [] arr)
    {
        for(int i =0 ; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");   //getter
        }
        System.out.println();
    }
    public static void main (String[] args)
    {
        int n = scn.nextInt();
        int []arr = new int[n];
        takeinput(arr);
        printarray(arr);
    }
}
    

