package files;

import java.io.File;

public class DeleteFile {

  //you can delete folders to

  public static void main(String[] args) {
    File file = new File("test.txt");
    if (file.delete()) {
      System.out.println("File deleted");
    } else {
      System.out.println("File not deleted");
    }
  }
}
