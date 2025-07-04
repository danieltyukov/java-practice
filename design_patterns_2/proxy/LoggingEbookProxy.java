package design_patterns_2.proxy;

public class LoggingEbookProxy implements Ebook {

  private String fileName;
  private RealEbook ebook;

  public LoggingEbookProxy(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void show() {
    if (ebook == null) ebook = new RealEbook(fileName);

    System.out.println("Logging");
    ebook.show();
  }

  @Override
  public String getFileName() {
    return fileName;
  }
}
