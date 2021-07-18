package streams;

public class Movies implements Comparable<Movies> {

  private String title;
  private Integer likes;

  public Movies(String title, Integer likes) {
    this.title = title;
    this.likes = likes;
  }

  public String getTitle() {
    return title;
  }

  public Integer getLikes() {
    return likes;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setLikes(Integer likes) {
    this.likes = likes;
  }

  public String toString() {
    return "Movies [title=" + title + ", likes=" + likes + "]";
  }

  @Override
  public int compareTo(Movies o) {
    return 0;
  }
}
