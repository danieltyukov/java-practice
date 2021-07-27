package generics;

public class UserList {

  private User[] items = new User[10];
  private int count;

  public UserList(int size) {
    items = new User[size];
  }

  public void add(User user) {
    if (count == items.length) {
      User[] temp = new User[items.length * 2];
      System.arraycopy(items, 0, temp, 0, items.length);
      items = temp;
    }
    items[count++] = user;
  }
}
