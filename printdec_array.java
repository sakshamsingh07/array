import java.util.Scanner;
public class printdec_array
{
    public static void incele(int []arr)
    {
        int n= arr.length;
        // int i= 0 ;
        // int j = i+1;
        for(int i =0;i<n;i++)
        {
            for (int j = i+1;j<n;j++)
            {
                if (arr[i]<arr[j])
                {
                    int c =arr[i];
                    arr[i]=arr[j];
                    arr[j]=c;
                    // i++;
                    // j++;

                }
            }
        }
    }

            

    public static void display(int []arr)
    {
        for(int i =0 ; i <arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String []args)
    {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i =0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        incele(arr);
        display(arr);
    }
}
