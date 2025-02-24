import java.util.*;
class moveZeroesToEnd{
   public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        moveZeroes(arr, n);
    }
    public static void moveZeroes(int []arr, int n)
    {
        int j=0,i=0;
        for(i=0; i<n;i++)
        {
            if(arr[i]==0)
            {
            j=i;
            break;
            }
        }
        for(i=j+1; i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(i=0;i<n ;i++)
        {
            System.out.print(arr[i]);
        }
    }
}