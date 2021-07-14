package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

  public static void main(String[] args) {
    try {
      FileWriter fileWriter = new FileWriter("test.txt");
      fileWriter.write("Hello, World!");
      fileWriter.close();
      System.out.println("Successfully wrote to file");
    } catch (IOException e) {
      System.out.println("Error writing to file");
      e.printStackTrace();
    }
  }
}
