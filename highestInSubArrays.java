import java.util.*;
class highestInSubArrays{
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
        
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->a[0]-b[0]);// min heap
        for(int i=0;i<k;i++)
        {
            q.add(new int[]{-arr[i],i});        //-arr[i] as it is min heap, but need highest element
        }
        System.out.print(-q.peek()[0]+" ");
        for(int i=k;i<n;i++)
        {
            q.add(new int[]{-arr[i],i});
            while(q.peek()[1]<i-k+1)
            {
                q.poll();
            }
            System.out.print(-q.peek()[0]+" ");
        }

    }
}