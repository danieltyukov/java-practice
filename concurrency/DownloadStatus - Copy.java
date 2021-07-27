package concurrency;

// import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {

  private boolean isDone;
  // private boolean volatile isDone;
  private LongAdder totalBytes = new LongAdder();
  //we can also use atom objects
  // private AtomicInteger totalBits = new AtomicInteger();
  private int totalFiles;
  private Lock lock = new ReentrantLock();

  public int getTotalBytes() {
    return totalBytes.intValue();
  }

  public void incrementTotalBytes() {
    //lock certan threads while other are processing
    //must have the finally block to avoid exceptions
    lock.lock();
    try {
      totalBytes.increment();
    } finally {
      lock.unlock();
    }
    //or we can use syncronized block
    synchronized (this) {
      totalBytes.increment();
    }
  }

  public void incrementTotalFiles() {
    totalFiles++;
  }

  //we can use syncronized block to avoid exceptions as methods
  public synchronized void decrementTotalFiles() {
    totalFiles--;
  }

  public int getTotalFiles() {
    return totalFiles;
  }

  public boolean isDone() {
    return isDone;
  }

  public void done() {
    isDone = true;
  }
}
