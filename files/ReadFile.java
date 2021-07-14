package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    try {
      File file = new File("test.txt");
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
      }
      if (file.exists()) {
        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Writeable: " + file.canWrite());
        System.out.println("Readable " + file.canRead());
        System.out.println("File size in bytes " + file.length());
      } else {
        System.out.println("The file does not exist.");
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("An  error occurred");
      e.printStackTrace();
    }
  }
}
