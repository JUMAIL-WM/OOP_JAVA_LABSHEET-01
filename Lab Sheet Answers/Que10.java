import java.util.Scanner;
import java.util.Arrays;

public class Que10
{
    public static void main(String[] args)
    {
        int[] array = readArray();
        sortArray(array);
        printArray(array);
    }

    public static int[] readArray()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");

        int length = input.nextInt();
        int[] array = new int[length];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++)
        {
            array[i] = input.nextInt();
        }
        input.close();
        return array;
    }

    public static void sortArray(int[] array)
    {
        Arrays.sort(array);
    }

    public static void printArray(int[] array)
    {
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
