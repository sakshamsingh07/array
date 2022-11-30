import java.util.Scanner; 
public class findElement 
{
    public static Scanner scn = new Scanner (System.in);
    public static boolean findElement(int [] arr , int data)
    {
        for(int i=0 ; i<arr.length; i++)
        {
            if(arr[i]==data)
            return(true);
        }
        return(false);
  
    }
   
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
        int data = scn.nextInt();
        int []arr = new int[n];
        findElement(arr, data);
       takeinput(arr);
       printarray(arr);
    }

}


