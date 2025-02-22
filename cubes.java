//given n and m, find the cubes of numbers in the range n & m
import java.util.*;
import java.util.Scanner;
import java.Math.*;
class cubes
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sumOfCubes=0;
        for(int i=n; i<=m; i++)
        {
            sumOfCubes+=Math.pow(i,3);
        }
        System.out.println(sumOfCubes);
    }
}