import java.util.Scanner;

public class Que04
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");

        int month = input.nextInt();

        switch (month)
        {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 or 29 days");
                break;
            default:
                System.out.println("31 days");
        }

        input.close();
    }
}
