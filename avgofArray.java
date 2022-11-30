import java.util.Scanner; 
public class avgofArray 
{
    public static float avg(int []arr)
    {
        int sum=0;
        float avg =0;
        for(int i =0 ;i<arr.length;i++)
        {
            sum+=arr[i];
            avg=sum/arr.length;
        }
        return avg;
    }
    public static void main(String []args)
    {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr= new int [n];
        for (int i =0 ;i<arr.length;i++)
        {
            arr[i]= scn.nextInt();
        }
        float ans=avg(arr);
        System.out.println(ans);
    }
    
}
