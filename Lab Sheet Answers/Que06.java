public class Que06
{
    public static void main(String[] args)
    {
        String str = "racecar";

        if (isPalindrome(str))
        {
            System.out.println(str + " is a palindrome.");
        }
        else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str)
    {
        if (str.length() <= 1)
        {
            return true;
        }
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        if (firstChar != lastChar)
        {
            return false;
        }
        String middle = str.substring(1, str.length() - 1);
        return isPalindrome(middle);
    }
}
