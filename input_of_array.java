import java.util.Scanner; 
public class input_of_array
{ 
    public static Scanner scn = new Scanner (System.in);
    public static void takeinput(int [] arr )
    {
        for(int i =0 ; i < arr.length; i++)
        {
            arr[i]=scn.nextInt();
        }

    }
    public static void printarray(int [] arr)
    {
        for(int i =0 ; i < arr.length; i ++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[]arr = new int[n];
        takeinput(arr);
        printarray(arr);

    }
}

