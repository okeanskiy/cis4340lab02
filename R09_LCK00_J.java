public class SomeObject {
  private final Object lock = new Object();
 
  public void changeValue() {
    synchronized (lock) {
      // ...
    }
  }
}
