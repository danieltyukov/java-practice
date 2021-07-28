package design_patterns_excercises_2.facade;

public class Demo {

  public static void show() {
    var twitterAPI = new TwitterAPI("appKey", "secret");
    var tweets = twitterAPI.getRecentTweets();
    System.out.println(tweets);
  }
}
