import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of digits");
            int num=sc.nextInt();
            int arr[]=new int[num];
            System.out.println("Enter the digits");
            for(int i=0;i<num;i++)
            {
                arr[i]=sc.nextInt();

            }
            MaxMin(arr);

        }
        public static void MaxMin(int arr[])
        {
            int max=arr[0];
            int min=arr[0];
            for(int i=1;i<arr.length;i++)
            {
                if (arr[i] > max)
                {
                    max = arr[i];
                }
                if (arr[i] < min)
                {
                    min = arr[i];
                }
            }
            System.out.println("Maximum number is " + max);
            System.out.println("Maximum number is " + min);
        }
}

