package files;

import java.io.File;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    try {
      File file = new File("test.txt");
      if (file.createNewFile()) {
        System.out.println("File Created " + file.getName());
      } else {
        System.out.println("File not Created");
      }
    } catch (IOException e) {
      System.out.println("An error occurred");
      e.printStackTrace();
    }
  }
}
