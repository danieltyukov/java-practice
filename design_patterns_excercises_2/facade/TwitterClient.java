package design_patterns_excercises_2.facade;

import java.util.ArrayList;
import java.util.List;

public class TwitterClient {

  public List<Tweet> getRecentTweets(String accessToken) {
    System.out.println("Getting recent tweets");

    return new ArrayList<>();
  }
}
