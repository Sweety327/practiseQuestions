import java.util.*;
class majorityElement{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        /* using hashmap
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i:arr)
        {
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> e:mp.entrySet())
        {
            if(e.getValue()>n/2)
            {
                System.out.print(e.getKey());
            }
        }*/
        //Boyer moore's voting algorithm
        int ele=0, count=0;
        for(int i:arr)
        {
            if(i==ele)
                count++;
            else if(count==0)
            {
                ele=i;
                count=1;
            }
            else{
                count--;
            }
        }
        System.out.println(ele);
    }
}