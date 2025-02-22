import java.util.*;
import java.util.Scanner
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
        //firstApproach(arr, n, k);
       thirdApproach(arr, n, k);
       //secondApproach(arr, n, k);
    }


    public static void firstApproach(int[] arr, int n, int k)
    {
        
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
    // 2nd approach
    public static void secondApproach(int[] arr, int n, int k)
    {
    int count=0;
     for(int i=0;i<n;i++)
     {
        for(int j=i+1; j<n; j++)
         {
        if(arr[i]+arr[j]==k)
         count++;
         }
     
     }
     System.out.println(count);
     }
     //Third approach
      public static void thirdApproach(int[] arr, int n, int k)
      {
      Set<String> mp=new HashSet<>();
      Set<Integer> visited=new HashSet<>();
      for(int i=0;i<n;i++)
      {int complement=k-arr[i];
      if(visited.contains(complement))
        {
                // Sorting the pair to avoid duplicates like (2,3) and (3,2)
                int first = Math.min(arr[i], complement);
                int second = Math.max(arr[i], complement);
                mp.add(first + "," + second);
        }
      visited.add(arr[i]);
      }
      System.out.println(mp.size());
      }
     
}
