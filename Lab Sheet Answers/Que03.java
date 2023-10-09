import java.util.Scanner;

public class Que03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double max = Math.max(num1, Math.max(num2, num3));

        System.out.println("The greatest number is: " + max);
        input.close();
    }
}
