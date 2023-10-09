import java.io.*;

public class Que09
{
    public static void main(String[] args)
    {
        String fileName = "sample.txt";

        writeToFile(fileName, "Hello, World!");

        String content = readFromFile(fileName);
        System.out.println("Content from the file:");
        System.out.println(content);
    }

    public static void writeToFile(String fileName, String content)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName)))
        {
            writer.write(content);
            System.out.println("Content successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFromFile(String fileName)
    {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
