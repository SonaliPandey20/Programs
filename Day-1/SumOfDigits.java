import java.util.Scanner;
public class sumofdigits 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt(); 
        int result = sumOfDigits(num);

        System.out.println("The sum of the digits of " + num + " is: " + result);
    }
    public static int sumOfDigits(int number) 
    {
        int sum = 0;
        number = Math.abs(number);

        while (number > 0) 
        {
            sum += number % 10;  
            number /= 10;       
        }
        return sum;
    }
}

