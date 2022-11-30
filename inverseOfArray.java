import java.util.Scanner;

// import javax.swing.ImageIcon; 
public class inverseOfArray
{
    public static int[] inverse(int [] a)
    {
        int [] ans = new int [a.length];
        for(int i=0; i<a.length;i++)
        {
            int val = a[i];
            ans[val] = i ;
        }
        return (ans);   
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
        for (int i =0 ; i<a.length; i++)
        {
            a[i]=scn.nextInt();
        }
        int [] answer = inverse(a);
        System.out.print(answer);
        // inverse(a);
    }
}