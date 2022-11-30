import java.util.Scanner; 
public class subarray
{
    public static void subarr(int []arr)
    {
        int n =arr.length;
        for(int start=0;start<n;start++)
        {
            for(int end =start;end<n;end++)
            {
                for(int ans = start;ans<=end;ans++)
                {
                    System.out.print(arr[ans]+"\t");
                }
                System.out.println();
            }
        }
    }
    public static void main(String []args)
    {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        int []arr = new int [n];
        for (int i =0 ;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        subarr(arr);
    }

}