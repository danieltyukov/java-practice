package concurrency;

public class ThreadDemo {

  public static void show() {
    //   var status = new DownloadStatus();
    // //wait() and notify()
    // var thread3 = new Thread(() -> {
    //   while (!status.isDone()) {
    //     synchronized (status) {
    //       try {
    //         status.wait();
    //       } catch (InterruptedException e) {
    //         e.printStackTrace();
    //       }

    // We can create a thread using a lambda expression
    var thread1 = new Thread(() -> System.out.println("a"));

    // or using an instance of a class that implements the Runnable interface
    var status = new DownloadStatus();
    var thread2 = new Thread(new DownloadFileTask(status));
    thread2.start();

    // Next we start a thread
    thread1.start();

    // We can wait for the completion of a thread
    try {
      thread1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // We can put a thread to sleep
    try {
      // thread1.sleep(5000);
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // We can get the current thread
    var current = Thread.currentThread();
    System.out.println(current.getId());
    System.out.println(current.getName());
  }
}
