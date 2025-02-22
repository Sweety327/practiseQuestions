import java.util.*;
import java.util.Scanner;
class pairs{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<n; i++)
        {
            int rem=k-arr[i];
            if(st.contains(rem))
            {
                count++;
            }
            st.push(arr[i]);
        }
        System.out.println(count);
    }
}