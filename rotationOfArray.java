import java.util.Scanner; 
public class rotationOfArray
{
    public static void rotation (int [] arr, int k )
    {
        k= k%arr.length ;
        if (k<0)
        {
            k+=arr.length;
        }
        int n = arr.length;
        reverse (arr,0,n-k-1);
        reverse (arr ,n-k,n-1);
        reverse (arr, 0,n-1);

    }
    public static void reverse ( int [] arr,int i , int j) 
    {
    // { int i =0 ;
    //   int j = arr.length-1;
      while(i<=j)
      {
          swap (arr, i ,j);
          i++;
          j--;
      }   
    }
    public static void swap(int [] arr , int i , int j)
    {
        int c = arr[i];
        arr[i]= arr[j];
        arr[j]= c;
    }
    public static void display(int [] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
           System.out.print(arr[i]);
        }
    }
    public static void main (String [] args )
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i=0 ; i<arr.length; i++)
        {
            arr[i]= scn.nextInt();
        }
        int k = scn.nextInt();
        rotation(arr,k);
        display(arr);

    }
}
