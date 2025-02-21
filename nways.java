import java.util.*;
import java.util.scanner;
class nways{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] t=new int[m][n];
        for(int[] i: t)
        {
            Arrays.fill(i,-1);
        }
        System.out.println(dp(m-1, n-1, t));
    }
    public static int dp(int m, int n,int[][] t)
    {
        if(m==0 && n==0)
            return 1;
        if(m<0 || n<0)
            return 0;
        if(t[m][n]!=-1) return t[m][n];
        int left=0, up=0;
        left=dp(m,n-1,t);
        up=dp(m-1,n,t);
        return t[m][n]=left+up;
    }
}