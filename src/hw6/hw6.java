package hw6;
import java.io.*;

public class hw6 {
    public static void main(String[] args) throws IOException {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("hw61.txt");
            PrintStream ps = new PrintStream(fileOutputStream);
            ps.println("Some text and else text, and else is written here.");
            ps.close();
            fileOutputStream.close();

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }


        try {
            FileOutputStream fileOutputStream1 = new FileOutputStream("hw62.txt");
            PrintStream ps1 = new PrintStream(fileOutputStream1);
            ps1.println("The text to be appended to the first text.");
            ps1.close();
            fileOutputStream1.close();

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("hw61.txt");
            int inputByteData;
            while ((inputByteData = fileInputStream.read()) != -1) {
                 System.out.print((char) inputByteData);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.out.println(ioException.getMessage());
        }
//
        try {
            FileInputStream fileInputStream = new FileInputStream("hw62.txt");
            int inputByteData;
            while ((inputByteData = fileInputStream.read()) != -1) {
                System.out.print((char) inputByteData);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.out.println(ioException.getMessage());
        }


    }
}







