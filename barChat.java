import java .util.Scanner; 
public class barChat
{
    public static int maximun(int [] arr)
    { int max= Integer.MIN_VALUE;
        for ( int i =0; i < arr.length; i++)
        {
            max= Math.max(max,arr[i]);
        }
        return(max);
    }
    public static void barchat(int [] arr)
    { 
        int n = maximun(arr) ;

        for(int h = n ; h>=1; h--);
        {
            for (int i= 0 ; i < arr.length; i++ )
            {
                if (arr[i]>=n)
                {
                    System.out.println("*\t");
                }
                else
                {
                    System.out.println("\t");
                }
            }
            
        }

    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr= new int[n];
        for(int i = 0; i<arr.length; i++)
        {
            arr[i]=scn.nextInt();
        }
        barchat(arr);
    }
}

